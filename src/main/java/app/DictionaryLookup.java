package app;

import cs121.Dict;
import java.util.Scanner;

public class DictionaryLookup {
    public static void check(Dict d, String word) {
        long startTime = System.nanoTime();
        boolean found = d.contains(word);
        long endTime = System.nanoTime();
        System.out.printf("%,d nanoseconds to search\n", endTime-startTime);
        if (found) {
            System.out.printf("\"%s\" is in dictionary\n", word);
        }
        else {
            System.out.printf("\"%s\" is *not* in dictionary\n", word);
            String upperCase = word.substring(0, 1).toUpperCase() + word.substring(1);
            if (d.contains(upperCase)) {
                System.out.printf("But, \"%s\" is!\n", upperCase);
            }
            String lowerCase = word.substring(0, 1).toLowerCase() + word.substring(1);
            if (d.contains(lowerCase)) {
                System.out.printf("But, \"%s\" is!\n", lowerCase);
            }
        }
    }

    public static void main(String[] args) {
        Dict dict = new DictionaryListSet();
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.print("word>");
            String line = keyboard.nextLine();
            if (line.isBlank()) {
                break;
            }
            check(dict, line);
        }

    }
}
