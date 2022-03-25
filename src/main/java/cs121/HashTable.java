package cs121;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;

public class HashTable implements Dict {
    final int tableSize = 1000000;
    private ArrayList<ArrayList<String>> table = new ArrayList<>(tableSize);
    private int itemCount = 0;

    public HashTable() {
        for (int i=0; i<tableSize; i++) {
            table.add(new ArrayList<>());
        }
    }
    @Override
    public boolean contains(String item) {
        int index = Math.abs(item.hashCode()%tableSize);
        ArrayList<String> list = table.get(index);
        return !list.isEmpty() && list.contains(item);
    }

    @Override
    public boolean add(String item) {
        int index = Math.abs(item.hashCode() % tableSize);
        //System.out.println("index=" + index);
        ArrayList<String> list = table.get(index);
        if (list == null) {
            list = new ArrayList<>();
            table.add(index, list);
        }
        if (!list.contains(item)) {
            list.add(item);
            itemCount++;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> collection) {
        boolean changed = false;
        for(String item: collection) {
            changed = changed || add(item);
        }
        return changed;
    }

    @Override
    public int size() {
        return itemCount;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }
}
