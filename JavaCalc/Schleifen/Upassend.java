import Tools.IOTools;

public class Upassend {
    public static void main(String[] args) {
        int x = IOTools.readInteger("Enter a number: "), bw = 1, count = 0;
        while (count <= 8) {
            bw = bw * 2;
            count++;

        }
        bw = bw / 2;
        System.out.println(count);
        System.out.println(bw);

        int n = 1;

        while (n <= count) {
            if (x / bw == n) {
                System.out.println("1");
                x = x - bw;
            } else {
                System.out.println("0");
            }
            bw = bw / 2;
            n++;
        }
    }
}
