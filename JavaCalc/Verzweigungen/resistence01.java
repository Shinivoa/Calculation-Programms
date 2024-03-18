import java.text.DecimalFormat;

import Tools.IOTools;

public class resistence01 {
    public static void main(String[] args) {
        double r1, r2, rg;
        char input = IOTools.readChar("(P) Paralell- oder (R) Reihenschaltung?: ");

        r1 = IOTools.readDouble(" resistence 1= ");
        r2 = IOTools.readDouble(" resistence 2 = ");

        if (input == 'P') {
            rg = r1 * r2 / r1 + r2;

        } else {
            rg = r1 + r2;
        }

        System.out.println(rg);

    }

}
