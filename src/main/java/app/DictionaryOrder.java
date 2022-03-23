package app;

import java.util.Comparator;

class DictionaryOrder implements Comparator<String> {

    public int compare(String s1, String s2) {

        if (s1.isEmpty() && s2.isEmpty()) {
            return 0;
        }

        int result = String.CASE_INSENSITIVE_ORDER.compare(s1, s2);
        if (result == 0) {
            return s1.charAt(0) - s2.charAt(0);
        }
        return result;
    }
}

