package Easy_and_Mixed_Problems;

public class Replace_Elements_with_Greatest_Element_on_Right_Side {

    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        res[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            res[i] = Math.max(res[i + 1], arr[i + 1]);
        }

        return res;
    }
}
