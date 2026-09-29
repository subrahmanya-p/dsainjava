
import java.util.Arrays;


class Main {

    static void reverse(int a[], int i, int j) {
        if (i >= j) {
            return;

        }
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        reverse(a, i + 1, j - 1);
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 65, 4, 00, 3, 4};
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
