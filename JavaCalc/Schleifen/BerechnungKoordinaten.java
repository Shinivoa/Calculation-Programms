import Tools.IOTools;

public class BerechnungKoordinaten {
    public static void main(String[] args) {

        double x = IOTools.readDouble("x =");
        double y = IOTools.readDouble("y =");

        int breite = 200;
        for (int i = 0; i <= breite; i++) {
            x = (i - breite / 2) * 1.0 / 10;
            y = 2 * x;
        }

        System.out.println("x =" + x + " y =" + y);
    }

}
