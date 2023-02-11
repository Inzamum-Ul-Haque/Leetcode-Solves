
package Arrays_and_Hashing;

import java.util.HashMap;

public class Two_Sums {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        int i;
        int res[] = new int[2];

        for (i = 0; i < nums.length; i++) {
            if (!h.containsKey(target - nums[i])) {
                h.put(nums[i], i);
            } else {
                res[0] = h.get(target -nums[i]);
                res[1] = i;
                break;
            }
        }
        return res;
    }
}
