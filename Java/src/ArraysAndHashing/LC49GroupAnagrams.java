package src.ArraysAndHashing;

import java.util.*;

public class LC49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupMap = new HashMap<>();
        for (String s : strs) {
            char[] countChar = new char[26];
            for (char c : s.toCharArray()) {
                countChar[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append(countChar[i]);
                sb.append("#");
            }
            String key = sb.toString();
            groupMap.putIfAbsent(key, new ArrayList<>());
            groupMap.get(key).add(s);
        }
        return new ArrayList<>(groupMap.values());
    }
}
