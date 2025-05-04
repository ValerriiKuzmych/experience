package experience;

import java.util.HashMap;
import java.util.Map;

public class WordScorer {

	public static Map<String, Integer> wordCounting(String text) {

		String[] words = text.toLowerCase().split("\\s+");

		Map<String, Integer> wordCount = new HashMap<>();
		
		
		for (String word : words) {
			
			wordCount.put(word, wordCount.getOrDefault(word, 0) +1);
			
			
		}

		return wordCount;

	}

}
