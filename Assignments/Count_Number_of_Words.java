import java.util.HashMap;

public class Count_Number_of_Words {
    public static void main(String[] args) {
        String inputString = "Samruddhi Hello Hello Samruddhi";
        HashMap<String, Integer> wordCountMap = countWords(inputString);

        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }

    public static HashMap<String, Integer> countWords(String inputString) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        String[] words = inputString.split("\\s+");
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
