
package Stack;

import java.util.Arrays;


public class Car_Fleet {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] sortedPS = new int[position.length][2];

        for (int i = 0; i < position.length; i++) {
            sortedPS[i][0] = position[i];
            sortedPS[i][1] = speed[i];
        }
        
        Arrays.sort(sortedPS, (a, b) -> b[0] - a[0]);

        double preFleet = (double)(target - sortedPS[0][0]) / sortedPS[0][1];
        int count = 1;
        for (int i = 1; i < position.length; i++) {
            double curFleet = (double)(target - sortedPS[i][0]) / sortedPS[i][1];
            if (curFleet > preFleet) {
                count++;
                preFleet = curFleet;
            }
        }

        return count;
    }
}
