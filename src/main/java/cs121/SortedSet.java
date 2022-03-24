package cs121;

import java.util.Comparator;

public class SortedSet<T> extends SortedList<T> implements SimpleSet<T> {

    public SortedSet(Comparator<T> comparator) {
        super(comparator);
    }

    @Override
    public boolean add(T item) {
        if (!contains(item)) {
            super.add(item);
            return true;
        }
        return false;
    }
}
