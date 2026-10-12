
import java.util.Arrays;

class QuickSort {

    public static int partition(int arr[], int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];
        while (i < j) {
            while (arr[i] >= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] <= pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void QuickSort(int arr[], int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            QuickSort(arr, low, partition);
            QuickSort(arr, partition + 1, high);
        }
        return;

    }

    public static void main(String[] args) {
        int arr[] = {4, 4, 3, 5, 6, 4, 7, 90, 8, 7, 66, 5};
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
