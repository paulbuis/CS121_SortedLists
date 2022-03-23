package app;

import cs121.Dict;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;


public class DictionaryTreeSet extends TreeSet<String> implements Dict {
    public DictionaryTreeSet() {
        super(new DictionaryOrder());
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
