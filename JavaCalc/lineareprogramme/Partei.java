package lineareprogramme;

import java.text.DecimalFormat;

import Tools.IOTools;

public class Partei {
    public static void main(String[] args) {

        DecimalFormat dF1 = new DecimalFormat("0.00");

        int vA, vB, vC, vD, vU;
        double pA, pB, pC, pD, pU;
        int all;

        vA = IOTools.readInteger("partei a = ");
        vB = IOTools.readInteger("partei b = ");
        vC = IOTools.readInteger("partei c = ");
        vD = IOTools.readInteger("partei d = ");
        vU = IOTools.readInteger("partei ungültig = ");

        all = vA + vB + vC + vD + vU;

        pA = 100.0 * vA / all;
        pB = 100.0 * vB / all;
        pC = 100.0 * vC / all;
        pD = 100.0 * vD / all;
        pU = 100.0 * vU / all;

        System.out.println("Prozente der Partei A: " + dF1.format(vA) + "%");
        System.out.println("Prozente der Partei B: " + dF1.format(vB) + "%");
        System.out.println("Prozente der Partei C: " + dF1.format(vC) + "%");
        System.out.println("Prozente der Partei D: " + dF1.format(vD) + "%");
        System.out.println("Prozente ungültige Stimmen: " + dF1.format(vU) + "%");

    }
}
