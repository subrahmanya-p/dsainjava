
class Main2 {

    static boolean ispali(int a[], int i) {
        if (i >= a.length - 1) {
            return true;
        }

        if (a[i] != a[a.length - i - 1]) {
            return false;
        }
        ispali(a, i+1);
        return true;
    }

    public static void main(String[] args) {
        int [] arr={1,2,81};
     
        System.out.println("is ??"+ispali(arr, 0));

    

    }
}
