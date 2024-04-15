public class stringki {
    public static void main(String[] args) {
        String vorname = new String("Adolf");
        String nachname = new String("Hitler");
        String name = new String();
        String ort = "Marburg";
        name = nachname + " " + vorname;
        System.out.println(name);

        name = name.trim();
        System.out.println(name);

        name = name.concat("Adolf");
        System.err.println(name);

        System.out.println(name.length());

        String teilString = name.substring(0, 15);
        System.out.println(teilString);

        char zeichen = name.charAt(0);
        System.out.println(zeichen);
        zeichen = name.charAt(name.length() - 1);
        System.out.println();
    }

}
