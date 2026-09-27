
class Main {

    static int count = 0;

    static void counter() {
        if (count == 5) {
            return;
        }

        System.out.println(count);
        count++;
        counter();

    }

    public static void main(String[] args) {
        counter();
        System.out.println("The value of the counter"+count);

    }
}
