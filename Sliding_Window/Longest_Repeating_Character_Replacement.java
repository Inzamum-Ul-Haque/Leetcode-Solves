package Sliding_Window;

import java.util.HashMap;

public class Longest_Repeating_Character_Replacement {

    public int returnMax(HashMap<Character, Integer> count) {
        int max = 0;
        for (int i : count.values()) {
            max = Math.max(max, i);
        }
        return max;
    }

    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        char temp = 'A';
        int res = 0;

        for (int i = 0; i < 26; i++) {
            count.put(temp, 0);
            temp++;
        }

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            count.put(s.charAt(right), count.get(s.charAt(right)) + 1);

            while ((right - left + 1) - returnMax(count) > k) {
                count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
                left += 1;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
