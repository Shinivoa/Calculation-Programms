package Verzweigungen;

import Tools.IOTools;

public class Rabattberechnung {
    public static void main(String[] args) {
        double rabatt, endprice, buypirce;

        buypirce = IOTools.readDouble("buyprice = ");

        if (buypirce < 1000) {

            rabatt = 3.0;

        } else {

            rabatt = 5.0;

        }
        endprice = buypirce * (1 - rabatt / 100);

        System.out.println(endprice);
    }

}
