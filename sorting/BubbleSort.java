
import java.util.Arrays;

class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 44, 4, 3, 1, -1, -5, 3};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
