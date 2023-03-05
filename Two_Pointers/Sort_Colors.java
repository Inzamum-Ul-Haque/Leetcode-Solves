package Two_Pointers;

public class Sort_Colors {

    public int partition(int[] nums, int low, int high) {
        int pivot = nums[high];

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[high];
        nums[high] = nums[i + 1];
        nums[i + 1] = temp;

        return i + 1;
    }

    public void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pi = partition(nums, low, high);

            quickSort(nums, low, pi - 1);
            quickSort(nums, pi + 1, high);
        }
    }

    public void sortColors(int[] nums) {
        int size = nums.length;
        quickSort(nums, 0, size - 1);
    }
}
