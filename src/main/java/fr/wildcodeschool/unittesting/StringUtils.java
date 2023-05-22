package fr.wildcodeschool.unittesting;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * 
     * @return Chaine avec uniquement des voyelles
     */

    public static String vowels(String candidate) {

        if (candidate == null) {
            throw new IllegalArgumentException("La chaîne de caractères ne peut pas être nulle");
        }

        StringBuilder vowels = new StringBuilder();
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0 && vowels.indexOf(String.valueOf(letters[i])) == -1) {
                vowels.append(letters[i]);
            }
        }
        return vowels.toString();
    }
}
