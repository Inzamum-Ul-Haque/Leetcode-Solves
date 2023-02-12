
package Arrays_and_Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for (int num : nums) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));

        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        List<Integer> res = new ArrayList<>();
        int[] result = new int[k];
        while (queue.size() > 0) {
            res.add(queue.poll().getKey());
        }

        Collections.reverse(res);

        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}
