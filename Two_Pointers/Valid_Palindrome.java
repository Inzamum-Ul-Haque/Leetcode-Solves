package Two_Pointers;

import java.util.ArrayList;
import java.util.List;

public class Valid_Palindrome {

    public boolean isPalindrome(String s) {
        List<Character> c1 = new ArrayList<Character>();
        List<Character> c2 = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) >= 97 && Character.toLowerCase(s.charAt(i)) <= 122
                    || Character.toLowerCase(s.charAt(i)) >= 48 && Character.toLowerCase(s.charAt(i)) <= 57) {
                c1.add(Character.toLowerCase(s.charAt(i)));
            }
        }

        for (int i = c1.size() - 1; i >= 0; i--) {
            c2.add(c1.get(i));
        }

        if (c1.equals(c2)) {
            return true;
        }
        return false;
    }
}
