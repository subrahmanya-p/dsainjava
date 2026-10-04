class MaxOfArray {

    static int max(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int maxValue = max(arr, n - 1);

        if (arr[n - 1] > maxValue) {
            return arr[n - 1];
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 8, 17};

        System.out.println(max(arr, arr.length));
    }
}