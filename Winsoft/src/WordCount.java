import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "This is a sample string with some sample words";

        // Split the string into words
        String[] words = str.split(" ");

        // Create a HashMap to store word frequencies
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Iterate through each word and update the word count in the HashMap
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                // If the word already exists in the map, increment its count
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word is encountered for the first time, add it to the map with count 1
                wordCountMap.put(word, 1);
            }
        }

        // Print the word count for each word
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
