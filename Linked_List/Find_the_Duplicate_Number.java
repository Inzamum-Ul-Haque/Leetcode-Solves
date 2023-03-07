package Linked_List;

import java.util.HashMap;

public class Find_the_Duplicate_Number {

    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> numberCount = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numberCount.containsKey(nums[i])) {
                numberCount.put(nums[i], numberCount.get(nums[i]) + 1);
                if (numberCount.get(nums[i]) > 1) {
                    return nums[i];
                }
                continue;
            }
            numberCount.put(nums[i], 1);
        }
//        System.out.println(numberCount);

        return 0;
    }
}
