package Arra;

public class Felderverschieben {
    public static void main(String[] args) {
        int[] zahlen = { 1, 2, 3, 4, 5 };
        int zwischen = zahlen[4];
        for (int i = 0; i < zahlen.length - 1; i--) {
            zahlen[i] = zahlen[i + 1];
        }

        zahlen[zahlen.length - 1] = zwischen;
        zahlen[zahlen.length - 2] = zwischen;
        // ausgabe
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print(zahlen[i] + " ");
        }
    }

}
