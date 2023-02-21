package Binary_Search;

public class Search_a_2d_Matrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            int left = 0, right = matrix[i].length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (matrix[i][mid] == target) {
                    return true;
                }

                if (matrix[i][mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}
