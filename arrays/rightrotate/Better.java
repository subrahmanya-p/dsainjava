 import  java.util.Arrays;
class Better {

    public static void main(String[] args) {
        int[] arr = {4, 4, 6, 7, 8, 9, 10, 1, 2, 3};
        int k = 3;
        int temp[] = new int[k];
        for (int i = arr.length - k; i <  arr.length ; i++) {
              temp[i - (arr.length - k) ] = arr[i];

        }
        for (int i = arr.length - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];

        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
