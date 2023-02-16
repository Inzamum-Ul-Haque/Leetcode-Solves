package Two_Pointers;

public class Container_With_Most_Water {

    public int maxArea(int[] height) {
        int i = 0, res = 0, area;
        int j = height.length - 1;

        while (i != j) {
            area = (j - i) * Math.min(height[i], height[j]);
            res = Math.max(res, area);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println(res);
        return res;
    }
}
