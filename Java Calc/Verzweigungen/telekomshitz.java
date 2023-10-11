package Verzweigungen;

import Tools.IOTools;

public class telekomshitz {
    public static void main(String[] args) {
        int anzahl = IOTools.readInteger("Anzahl = ");
        double l = anzahl > 10 ? anzahl * 0.1 : 0;
        System.out.println((13) + l);
    }
}
