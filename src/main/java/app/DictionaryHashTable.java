package app;

public class DictionaryHashTable extends cs121.HashTable {
    public DictionaryHashTable() {
        DictionaryList list = new DictionaryList();

        long startTime = System.nanoTime();
        for (String s : list) {
            add(s);
        }
        long endTime = System.nanoTime();
        long elapsed = (endTime - startTime);
        System.out.printf("%,d nanoseconds to construct dictionary list set\n", elapsed);
        System.out.printf("%,d words in dictionary\n", size());
        System.out.printf("%f nanoseconds/word\n", elapsed / (double) size());

    }
}
