
class Main {

    public static void main(String[] args) {
        ///program to check how many time the number are repeated  from 0 to 12
        int[] arr = new int[13];
        int[] data = {1, 2, 2, 3, 3, 3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6};
        for (int elem : data) {
            arr[elem]++;

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(i + " appeared : " + arr[i] + " timees ");
            }

        }

    }
}
