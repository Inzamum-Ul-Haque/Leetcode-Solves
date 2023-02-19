
package Stack;

import java.util.Stack;


public class Largest_Rectangle_Area {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> index = new Stack<>();
        int maxArea = 0;
        int i;
        for (i = 0; i < heights.length;) {
            if (index.isEmpty() || heights[i] >= heights[index.peek()]) {
                index.push(i);
                i++;
            } else {
                int p = index.pop();
                int h = heights[p];
                int w = index.isEmpty() ? i : i - index.peek() - 1;
                maxArea = Math.max(h * w, maxArea);
            }
        }

        while (!index.isEmpty()) {
            int p = index.pop();
            int h = heights[p];
            int w = index.isEmpty() ? i : i - index.peek() - 1;
            maxArea = Math.max(h * w, maxArea);
        }

        return maxArea;
    }
}
