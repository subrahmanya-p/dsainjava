
import java.util.Arrays;


class Better {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 4, 3, 2, 4, 566, 6};
        int k = 3;
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];

        }
        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];

        }
        for (int i = arr.length - k; i < arr.length; i++) {
            arr[i] = temp[i - (arr.length - k)];

        }
        System.out.println(Arrays.toString(arr));

    }
}
