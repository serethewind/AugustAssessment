package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingAllAnagrams {

    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            int[] count = new int[26]; // Assuming lowercase English letters
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder keyBuilder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    keyBuilder.append('a' + i).append(count[i]);
                }
            }
            String key = keyBuilder.toString();

            anagramGroups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        String[] words = {
                "actors", "costar",
                "altered", "related",
                "auctioned", "education",
                "aspired", "despair",
                "mastering", "streaming",
                "recurd", "secured"
        };

        List<List<String>> anagramGroups = groupAnagrams(words);

        for (List<String> group : anagramGroups) {
            System.out.println(group);
        }
    }
}
