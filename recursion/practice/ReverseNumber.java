
class ReverseNumber {

    static int rev(int n, int res) {
        if (n == 0) {
            return res;
        }

        res = res * 10 + n % 10;
        n /= 10;

        return rev(n, res);
    }

    public static void main(String[] args) {
        System.out.println(rev(12345, 0));
    }
}
