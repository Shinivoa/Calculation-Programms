package Arra;

public class LottoV2 {
    public static void main(String[] args) {
        int[] zahlen = new int[6];
        int zaehler = 0;
        int zufallszahl;
        boolean zahlBereitsImArray = false;

        do {
            zufallszahl = (int) (Math.random() * 49) + 1;
            zahlBereitsImArray = false;

            for (int i = 0; i < zaehler; i++) {
                if (zahlen[i] == zufallszahl) {
                    zahlBereitsImArray = true;
                    break;
                }
            }
            if (!zahlBereitsImArray) {
                zahlen[zaehler] = zufallszahl;
                System.out.println(zufallszahl);
                zaehler++;
            }
        } while (zaehler < 6);

    }
}
