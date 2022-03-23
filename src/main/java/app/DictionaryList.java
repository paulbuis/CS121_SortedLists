package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryList extends ArrayList<String> {
    public DictionaryList() {
        try {
            long startTime = System.nanoTime();
            Scanner file = new Scanner(new File("dict200k.txt"));
            while (file.hasNextLine()) {
                String line = file.nextLine();
                add(line);
            }
            long endTime = System.nanoTime();
            System.out.printf("%,d nanoseconds for I/O\n", (endTime - startTime));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.printf("%,d words in list\n", size());
    }
}
