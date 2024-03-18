
import Tools.IOTools;

public class whiles {
    public static void main(String[] args) {
        int n = IOTools.readInteger(" Bitte geben Sie eine Zahl ein: ");
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Die Summe der natürlichen Zahlen bis " + n + " ist: " + sum);

    }
}