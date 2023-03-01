package Sliding_Window;

import java.util.HashMap;

public class Minimum_Window_Substring {

    public String minWindow(String s, String t) {
        if (t.length() == 0) {
            return "";
        }

        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            if (!countT.containsKey(t.charAt(i))) {
                countT.put(t.charAt(i), 1);
            } else {
                countT.put(t.charAt(i), countT.get(t.charAt(i)) + 1);
            }
        }

        int have = 0, need = countT.size(), l = 0, resLen = Integer.MAX_VALUE;
        int left = -1, right = -1;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (!window.containsKey(c)) {
                window.put(c, 1);
            } else {
                window.put(c, 1 + window.get(c));
            }

            if (countT.containsKey(c) && window.get(c) == countT.get(c)) {
                have += 1;
            }

            while (have == need) {
                //update our result
                if (r - l + 1 < resLen) {
                    left = l;
                    right = r;
                    resLen = r - l + 1;
                }

                //shrink the window size
                window.put(s.charAt(l), window.get(s.charAt(l)) - 1);
                if (countT.containsKey(s.charAt(l)) && window.get(s.charAt(l)) < countT.get(s.charAt(l))) {
                    have -= 1;
                }
                l += 1;
            }
        }

        return resLen != Integer.MAX_VALUE ? s.substring(left, right + 1) : "";
    }
}
