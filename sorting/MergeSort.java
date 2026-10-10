
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeSort {

    static void merge(int arr[], int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        List l1 = new ArrayList();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                l1.add(arr[left]);
                left++;

            } else {
                l1.add(arr[right]);
                right++;
            }

        }

        while (left <= mid) {
            l1.add(arr[left]);
            left++;

        }
        while (right <= high) {
            l1.add(arr[right]);
            right++;

        }
        for (int i = low; i <= high; i++) {
            arr[i] = (int) l1.get(i-low);

        }
    }

    static void mergeSot(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSot(arr, low, mid);
        mergeSot(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 4, 5, 44, 4, 3, 5, 66, 4, 4};

        mergeSot(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
