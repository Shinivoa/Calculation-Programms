package Sternaufgabe;

import Tools.IOTools;

public class Sternchen1 {
    public static void main(String[] args) {

        int anzhal = IOTools.readInteger("amout: ");

        for (int i = 1; i <= anzhal; i++) {
            for (int j = 1; j <= anzhal; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}