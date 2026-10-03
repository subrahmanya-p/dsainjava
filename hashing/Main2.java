
class Main2 {

    public static void main(String[] args) {
        String str = "abbcccddddeeeeez";
        int[] hash = new int[26];
        for (char c : str.toCharArray()) {
            hash[c - 'a']++;

        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] != 0) {
                System.out.println("Character " + (char) ('a' + i) + " is  present at " + hash[i] + " times");
            }

        }
    }
}
