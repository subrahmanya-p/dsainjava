
class Main2 {

    static void printName(int n) {
        if (n >= 5) {
            return;
        }
        System.out.println("Subra");
        printName(n + 1);

    }

    public static void main(String[] args) {
        printName(0);

    }
}
