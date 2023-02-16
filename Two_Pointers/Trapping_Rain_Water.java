package Two_Pointers;

public class Trapping_Rain_Water {

    public int trap(int[] height) {
        int res = 0, maxL = 0, maxR = 0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];

        for (int i = 0; i < height.length; i++) {
            maxLeft[i] = maxL;
            if (height[i] > maxL) {
                maxL = height[i];
            }
        }

        for (int i = height.length - 1; i >= 0; i--) {
            maxRight[i] = maxR;
            if (height[i] > maxR) {
                maxR = height[i];
            }
        }

        for (int i = 0; i < height.length; i++) {
            if (Math.min(maxLeft[i], maxRight[i]) - height[i] >= 0) {
                res += Math.min(maxLeft[i], maxRight[i]) - height[i];
            }
        }

        return res;
    }
}
