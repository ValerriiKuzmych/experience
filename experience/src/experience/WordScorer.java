package experience;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class WordScorer {

//	public static Map<String, Integer> wordCounting(String text) {
//
//		String[] words = text.toLowerCase().split("\\s+");
//
//		Map<String, Integer> wordCount = new HashMap<>();
//
//		for (String word : words) {
//
//			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//
//		}
//
//		return wordCount;
//
//	}

	public static List<String> getMostCommonWords(List<String> messages) {

		Set<String> stopWords = Set.of("а", "the", "is");

		Map<String, Integer> wordCount = new HashMap<>();

		for (String message : messages) {

			message = message.toLowerCase().replaceAll("[^a-z\\s]", "");

			String[] words = message.split("\\s+");

			for (String word : words) {

				if (!stopWords.contains(word) && !word.isBlank()) {

					wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

				}
			}

		}
		return wordCount.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).limit(3)
				.map(entry -> entry.getKey() + ": " + entry.getValue()).collect(Collectors.toList());
	}

	public static Map<String, Integer> wordScoring(String[] words) {

		Map<String, Integer> wordCount = new TreeMap<String, Integer>();

		for (String word : words) {

			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

		}

		return wordCount;

	}

}
