
import java.util.Arrays;


class Main1 {

    static void reverse(int a[], int i) {
        if (i >= a.length/2) {
            return;

        }
        int temp = a[i];
        a[i] = a[a.length-i-1];
        a[a.length-i-1] = temp;
        reverse(a, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 65, 4, 00, 3, 4};
        reverse(arr, 0);
        System.out.println(Arrays.toString(arr));

    }
}
