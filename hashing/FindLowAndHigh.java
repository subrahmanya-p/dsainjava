
import java.util.LinkedHashMap;
import java.util.Map;

class FindLowAndHigh {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 555, 5, 5, 5, 5, 5, 5, 5, 5, 8, 7, 7, 6, 6, 6, 6, 5, 5, 4};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int elem : arr) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);

        }
        int minkey = 0, maxkey = 0;
        int MaxValue = Integer.MIN_VALUE;
        int MinValue = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > MaxValue) {
                maxkey = entry.getKey();
                MaxValue = entry.getValue();

            }
            if (entry.getValue() < MinValue) {
                minkey = entry.getKey();
                MinValue = entry.getValue();

            }

        }
        System.out.println("Min : " + minkey + "-" + MinValue);
        System.out.println("Min : " + maxkey + "-" + MaxValue);
    }
}
