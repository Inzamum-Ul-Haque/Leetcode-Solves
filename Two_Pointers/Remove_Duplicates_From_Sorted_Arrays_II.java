package Two_Pointers;

import java.util.Arrays;

public class Remove_Duplicates_From_Sorted_Arrays_II {

    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0, count;
        while (right < nums.length) {
            count = 1;
            while (right + 1 < nums.length && nums[right] == nums[right + 1]) {
                right += 1;
                count++;
            }

            for (int i = 0; i < Math.min(2, count); i++) {
                nums[left] = nums[right];
                left += 1;
            }
            right += 1;
        }
        System.out.println(Arrays.toString(nums));
        return left;
    }
}
