package lineareprogramme;

import java.text.DecimalFormat;

import Tools.IOTools;

public class konstante {
    public static void main(String[] args) {
        DecimalFormat dF1 = new DecimalFormat("0.00");

        final double MWST = 0.16, SP_A = 23.50, SP_B = 79.90, SP_C = 113.50, SP_D = 159.80;

        int SA, SB, SC, SD;
        double ZA, ZB, ZC, ZD;
        double SOhneMwSt, SMitMwSt;

        SA = IOTools.readInteger("ARTICLE A =");
        SB = IOTools.readInteger("ARTICLE B =");
        SC = IOTools.readInteger("ARTICLE C =");
        SD = IOTools.readInteger("ARTICLE D =");

        System.out.println(SP_A + " EURO");
        System.out.println(SP_B + " EURO");
        System.out.println(SP_C + " EURO");
        System.out.println(SP_D + " EURO");

        System.out.println(dF1.format(SP_A + SP_B + SP_C + SP_D) + " EURO");

    }

}
