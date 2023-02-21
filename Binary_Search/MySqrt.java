package Binary_Search;

public class MySqrt {

    public int mySqrt(int x) {
        double t = 0.5 * Math.log10((double) x);
        double res = Math.pow(10, t);

        return (int) res;
    }
}
