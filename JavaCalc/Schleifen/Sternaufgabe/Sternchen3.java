package Sternaufgabe;

import Tools.IOTools;

public class Sternchen3 {
    public static void main(String[] args) {

        int i = IOTools.readInteger("amout");
        int j = i;

        for (int zeilen = 1; zeilen <= i; zeilen++) {
            j--;
            for (int s = 0; s < j; s++) {
                System.out.print(" ");
            }
            for (int d = 0; d < 2 * zeilen; d++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
