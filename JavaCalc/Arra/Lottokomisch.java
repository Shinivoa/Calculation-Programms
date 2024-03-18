package Arra;

public class Lottokomisch {
    public static void main(String[] args) {
        int[] zahlen = new int[6];
        int zufallszahl;
        int zaehler = 0;

        for (int i = 0; i < 2; i++) {
            for (zaehler = 0; zaehler < zahlen.length; zaehler++) {
                zufallszahl = (int) (Math.random() * 49 + 1);
                if (zufallszahl != zahlen[0]) {
                    zahlen[zaehler] = zufallszahl;
                }
                if (zufallszahl != zahlen[1]) {
                    zahlen[zaehler] = zufallszahl;
                }
                if (zufallszahl != zahlen[2]) {
                    zahlen[zaehler] = zufallszahl;
                }
                if (zufallszahl != zahlen[3]) {
                    zahlen[zaehler] = zufallszahl;
                }
                if (zufallszahl != zahlen[4]) {
                    zahlen[zaehler] = zufallszahl;
                }
                if (zufallszahl != zahlen[5]) {
                    zahlen[zaehler] = zufallszahl;
                }

                System.out.print(zufallszahl + " ");
                zaehler++;
            }
        }
    }
}
