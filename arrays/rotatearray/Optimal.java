
import java.util.Arrays;


class Optimal {

    static void reverse(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;

        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 4, 3, 2, 4, 566, 6};
        int k = 3;
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
