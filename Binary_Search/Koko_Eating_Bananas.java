package Binary_Search;

import java.util.Arrays;

public class Koko_Eating_Bananas {

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l < r) {
            int mid = (l + r) / 2;
            int hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;
            }

            if (hours <= h) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}
