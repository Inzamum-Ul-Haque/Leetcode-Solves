
package Arrays_and_Hashing;

import java.util.HashSet;


public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!h.contains(nums[i])) {
                h.add(nums[i]);
            }
        }

        if(h.size() == nums.length){
            return false;
        }
        else{
            return true;
        }
    }
}
