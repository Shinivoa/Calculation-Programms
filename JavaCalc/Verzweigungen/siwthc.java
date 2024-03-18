import java.time.LocalDateTime;

public class siwthc {
    public static void main(String[] args) {
        int hour = LocalDateTime.now().getHour();

        switch (hour) {
            case 22, 23, 24, 1, 2, 3, 4:
                System.out.println("Gute Nacht!");
                break;
            case 5, 6, 7, 8, 9, 10:
                System.out.println("Guten Morgen!");
                break;
            case 18, 19, 20, 21:
                System.out.println("Guten Abend!");
                break;
            default:
                System.out.println("Guten Tag!");

        }

    }

}
