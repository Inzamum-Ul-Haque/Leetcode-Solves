package Easy_and_Mixed_Problems;

public class Reverse_Integer {

    public int reverse(int x) {
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;
        int res = 0, digit;

        while (x != 0) {
            digit = x % 10;
            x = x / 10;

            if (res > MAX / 10 || (res == MAX && digit >= MAX % 10)) {
                return 0;
            }
            if (res < MIN / 10 || (res == MIN && digit <= MIN % 10)) {
                return 0;
            }

            res = (res * 10) + digit;
        }
        return res;
    }
}
