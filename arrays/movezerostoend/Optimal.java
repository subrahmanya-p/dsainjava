
import java.util.Arrays;

class Optimal {

    public static void main(String[] args) {
        int[] arr = {5, 0, 4, 3, 3, 0, 8, 7, 0, 6, 6, 4, 4, 4};
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j=i;
                break;
            }
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
