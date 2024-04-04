import java.util.HashMap;
import java.util.Map;

public class Duplicate {

    public static void main(String[] args) {
        String inputString = "My Name is Ritesh Taru";
        Map<Character, Integer> charCountMap = new HashMap<>();

        char[] charArray = inputString.toCharArray();

        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println("Duplicate characters in the string '" + inputString + "':");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}

