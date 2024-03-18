
public class Funkationwhile {
    public static void main(String[] args) {
        double iv2 = 4, iv = -3, st = 0.5, x = -3, y;
        y = 0;

        while (x < iv2) {
            y = Math.pow(x, 2) - 2 * x + 3;
            System.out.println(y);
            x++;
        }
        System.out.println(x + y);

    }
}
