
import java.util.*;

class Brute {
    public static void main(String[] args) {
        int[] arr = {5, 0, 4, 3, 3, 0, 8, 7, 0, 6, 6, 4, 4, 4};
        List l1 = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                l1.add(arr[i]); }
        }
        for (int i = 0; i < l1.size(); i++) {
            arr[i] = (int) l1.get(i);
        }
        for (int i = l1.size(); i < arr.length; i++) {
            arr[i]=0;
        }
            System.out.println(Arrays.toString(arr));
    }
}
