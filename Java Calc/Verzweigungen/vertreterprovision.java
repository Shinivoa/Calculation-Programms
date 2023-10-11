package Verzweigungen;

import Tools.IOTools;

public class vertreterprovision {
    public static void main(String[] args) {
        double earnings, provision;
        provision = 0;

        earnings = IOTools.readDouble("Earnings = ");

        if (earnings > 50000) {
            provision = 4.0;
        } else if (earnings > 25000 && earnings < 50000) {
            provision = 3.5;
        } else if (earnings < 25000) {
            provision = 3.0;
        }

        earnings = earnings * (1 + provision / 100);

        System.out.println(earnings + "Euro");

    }
}
