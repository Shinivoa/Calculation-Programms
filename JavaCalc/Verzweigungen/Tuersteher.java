import Tools.IOTools;

public class Tuersteher {
    public static void main(String[] args) {
        boolean hunger, durst, geld;

        hunger = IOTools.readBoolean("Are you hungry? :");
        durst = IOTools.readBoolean("Are you thirsty? :");
        geld = IOTools.readBoolean("Do you have money? :");

        if (geld && (durst || hunger)) {
            System.out.println("du darfst rein");
        } else {
            System.out.println("du darfst nicht rein");
        }

    }
}
