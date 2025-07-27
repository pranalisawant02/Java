import java.util.HashMap;
import java.util.Map;

/**
 * This class provides a method to count the occurrences of each character in a given string.
 */
public class CharacterCounter {

    /**
     * Counts the occurrences of each character in a string and returns them in a Map.
     *
     * @param inputString The string to analyze.
     * @return A Map where keys are characters and values are their respective counts.
     * @throws IllegalArgumentException if the inputString is null.
     */
    public static Map<Character, Integer> countCharacters(String inputString) {
        if (inputString == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }

        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        return charCounts;
    }

    public static void main(String[] args) {
        String text1 = "hello world";
        Map<Character, Integer> counts1 = countCharacters(text1);
        System.out.println("Character counts for \"" + text1 + "\": " + counts1);

        String text2 = "programming";
        Map<Character, Integer> counts2 = countCharacters(text2);
        System.out.println("Character counts for \"" + text2 + "\": " + counts2);

        String text3 = "";
        Map<Character, Integer> counts3 = countCharacters(text3);
        System.out.println("Character counts for \"" + text3 + "\": " + counts3);

        try {
            countCharacters(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
