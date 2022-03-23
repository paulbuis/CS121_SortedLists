package cs121;

import java.util.*;

public class SortedList<T> implements Iterable<T> {
    private final Comparator<T> comparator;
    private final ArrayList<T> list = new ArrayList<>(250000);


    public SortedList(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public boolean add(T item) {
        int index = Collections.binarySearch(list, item, comparator);
        if (index < 0) {
            index = -(index+1);
        }
        list.add(index, item);
        return true;
    }

    public boolean addAll(Collection<? extends T> c) {
        boolean changed = false;
        for (T item: c) {
            changed = changed || add(item);
        }
        return changed;
    }


    public boolean remove(T item) {
        int index = Collections.binarySearch(list, item, comparator);
        if (index >= 0) {
            list.remove(index);
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection <T> collection) {
        boolean changed = false;
        for (T item: collection) {
            changed = changed || remove(item);
        }
        return changed;
    }

    public boolean contains(T item) {
        return Collections.binarySearch(list, item, comparator) >= 0;
    }

    public boolean equals(List<T> otherList) {
        return list.equals(otherList);
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return list.stream().iterator();
    }
}
