package cs121;

import java.util.Collection;

// SimpleSet<T> is intended to be a sub-interface
// of java.util.Set<T>.
// In particular, if a class implements java.util.Set<String>
// it can also trivially implement SimpleSet<String>
public interface SimpleSet<T> extends Iterable<T> {
    boolean add(T item);
    boolean addAll(Collection<? extends T> collection);
    int size();
}
