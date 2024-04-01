import java.util.HashMap;
import java.util.Map;

public class Q10 {
    
    public static void main(String[] args) {
        String text = "This is a sample string. It contains some sample words. Sample words may repeat in the string.";
        Map<String, Integer> wordFrequency = new HashMap<>();
        
       
        String[] words = text.split("\\s+");
        
       
        for (String word : words) {
            word = word.toLowerCase(); 
            int frequency = wordFrequency.getOrDefault(word, 0);
            wordFrequency.put(word, frequency + 1);
        }
        
      
        int maxFrequency = 0;
        for (int freq : wordFrequency.values()) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }
        
        
        System.out.println("Most occurring words:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
