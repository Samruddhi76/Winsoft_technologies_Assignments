import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "Hello Samruddhi";

        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] chars = inputString.toCharArray();
        for (char c : chars) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        Set<Map.Entry<Character, Integer>> entrySet = charCountMap.entrySet();
        System.out.println("Duplicate characters in the string '" + inputString + "' are:");
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
