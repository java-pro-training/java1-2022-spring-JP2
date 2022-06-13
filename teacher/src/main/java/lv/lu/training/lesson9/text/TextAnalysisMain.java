package lv.lu.training.lesson9.text;

import java.util.*;

public class TextAnalysisMain {

    public static void main(String[] args) {
        Map<String, Integer> analysis = analyze(Text.VALUE);
        List<Map.Entry<String, Integer>> analysisList = sortAndReverseResults(analysis);
        print(analysisList);
    }

   private static List<Map.Entry<String, Integer>> sortAndReverseResults(Map<String, Integer> analysis) {
        List<Map.Entry<String, Integer>> analysisList = new ArrayList<>(analysis.entrySet());
        analysisList.sort(Map.Entry.comparingByValue());
        Collections.reverse(analysisList);
        return analysisList;
    }

    private static void print(List<Map.Entry<String, Integer>> analysisList) {
        for (Map.Entry<String, Integer> entry : analysisList) {
            System.out.println("Simbols " + entry.getKey() + " tekstā ir izmantots " + entry.getValue() + " reizes.");
        }
    }

    public static Map<String, Integer> analyze(String text) {
        Map<String, Integer> analysis = new HashMap<>();
        for (char character : lowercasedWithoutWhitespaces(text).toCharArray()) {
            Integer value = analysis.get(keyOf(character));
            if (value == null) {
                analysis.put(keyOf(character), 1);
            } else {
                value++;
                analysis.put(keyOf(character), value);
            }
        }
        return analysis;
    }

    private static String lowercasedWithoutWhitespaces(String text) {
        return text.replaceAll(" ", "")
                .replaceAll("\\n", "")
                .toLowerCase();
    }

    private static String keyOf(char character) {
        String key = String.valueOf(character);
        return key;
    }


}
