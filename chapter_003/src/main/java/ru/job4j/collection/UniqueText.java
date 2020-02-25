package ru.job4j.collection;

import java.util.Collections;
import java.util.HashSet;

/**
 * @author Roman Vokhmin
 * @since 0.1
 */
public class UniqueText {
    /**
     *
     * @param originText origin text
     * @param duplicateText duplicate text
     * @return boolean false if both text equal
     */
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        Collections.addAll(check, origin);
        for (String word :text) {
            if (!check.contains(word)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
