package Binary_Search;

import java.util.Stack;

public class Arranging_Coins {

    public int arrangeCoins(int n) {
        Stack<Integer> s = new Stack<>();
        int i = 1;
        while (n - i >= 0) {
            int t = n - i;
            s.push(n - t);
            n -= i;
            i++;
        }

        return s.size();
    }
}
