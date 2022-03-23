package cs121;

import java.util.Collection;

public interface SimpleSet<T> {
    boolean add(T item);
    boolean addAll(Collection<? extends T> collection);
    int size();
}
