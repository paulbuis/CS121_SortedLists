package app;

import cs121.Dict;

import java.util.Collection;
import java.util.HashSet;

public class DictionaryHashSet extends HashSet<String> implements Dict {
    public DictionaryHashSet() {
        DictionaryList list = new DictionaryList();

        long startTime = System.nanoTime();
        for (String s: list) {
            add(s);
        }
        long endTime = System.nanoTime();
        long elapsed = (endTime-startTime);
        System.out.printf("%,d nanoseconds to construct dictionary tree set\n", elapsed);
        System.out.printf("%,d words in dictionary\n", size());
        System.out.printf("%f nanoseconds/word\n", elapsed/(double)size());

    }

    public boolean addAll(Collection<? extends String> collection) {
        return super.addAll(collection);
    }

    public boolean contains(String s) {
        return super.contains(s);
    }

}

