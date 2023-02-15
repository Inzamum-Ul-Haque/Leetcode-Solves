package Two_Pointers;

import java.util.HashMap;

public class Two_Sum_2 {

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        int res[] = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (!h.containsKey(target - numbers[i])) {
                h.put(numbers[i], i);
            } else {
                res[0] = h.get(target - numbers[i]) + 1;
                res[1] = i + 1;
            }
        }

        System.out.println(res[0] + " " + res[1]);
        return res;
    }
}
