
package Arrays_and_Hashing;

import java.util.LinkedHashSet;
import java.util.Set;


public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new LinkedHashSet<Integer>();
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!s.contains(nums[i] - 1)) {
                int length = 0;
                while (s.contains(nums[i] + length)) {
                    length += 1;
                }
                longest = Math.max(length, longest);
            }
        }

        return longest;
    }
}
