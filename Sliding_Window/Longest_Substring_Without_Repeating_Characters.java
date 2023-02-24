package Sliding_Window;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int l = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l += 1;
            }
            charSet.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
