package ru.job4j.array;

/**
 * ArrayChar.
 * @author Roman Vokhmin
 */
public class ArrayChar {
    /**
     *
     * @param word - контрольный массив символов
     * @param pref - массив сиволов, с которых начинается массив ворд
     * @return - boolean, начинается ли word с pref
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
