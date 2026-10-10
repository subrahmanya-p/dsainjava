
import java.util.Arrays;

class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 44, 4, 3, 1, -1, -5, 3};
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
