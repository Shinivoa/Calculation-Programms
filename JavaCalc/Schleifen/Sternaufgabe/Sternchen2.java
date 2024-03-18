package Sternaufgabe;

import Tools.IOTools;

public class Sternchen2 {
    public static void main(String[] args) {

        int i = IOTools.readInteger("amout: ");

        for (int f = 1; f <= i; f++) {
            for (int j = 0; j < f - 1; j++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= i; s++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
