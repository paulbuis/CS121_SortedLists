package cs121;


// Dict is intended to be a subinterface of java.util.Set<String>
// so if a class implements java.util.Set<String>
// it will also implement Dict.
public interface Dict extends SimpleSet<String> {
    boolean contains(String item);
}



