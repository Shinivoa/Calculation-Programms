package Arra;

public class Lotto {
    public static void main(String[] args) {
        int[] zahl = new int[6];
        boolean[] lottozahlen = new boolean[70];
        int zufallszahl;
        int zaehler = 0;

        do {
            zufallszahl = (int) (Math.random() * 69 + 1);
            if (lottozahlen[zufallszahl] == false) {
                lottozahlen[zufallszahl] = true;
                zahl[zaehler] = zufallszahl;
                System.out.print(zufallszahl + " ");
                zaehler++;
            }
        } while (zaehler < 6);
    }

}
