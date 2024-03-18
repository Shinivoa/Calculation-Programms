import Tools.IOTools;

public class schaltjahr {
    public static void main(String[] args) {
        int jahr;

        jahr = IOTools.readInteger("Bitte geben Sie ein Jahr ein: ");

        if (jahr % 4 == 0) {
            System.out.println(jahr + " ist ein Schaltjahr");
        } else {
            if (jahr % 100 == 0) {
                System.out.println(jahr + " ist ein Schaltjahr");
            } else {
                if (jahr % 400 == 0) {
                    System.out.println(jahr + " ist ein Schaltjahr");
                } else {
                    System.out.println(jahr + " ist kein Schaltjahr");
                }
            }
        }
    }
}
