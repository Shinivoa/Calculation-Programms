package Verzweigungen;

import Tools.IOTools;

public class Lohnberechnung {
    public static void main(String[] args) {
        double workhours, hourpayment, weeklypayment;
        final int MAXHOURS = 40;

        workhours = IOTools.readDouble("input the workhours = ");
        hourpayment = IOTools.readDouble("input your hourlypayment =");

        weeklypayment = hourpayment * workhours;

        if (workhours > MAXHOURS) {
            weeklypayment = weeklypayment + (workhours - MAXHOURS) * hourpayment / 2;

        }
        System.out.println("your weeklypayment with overtime is = " + weeklypayment);
    }

}
