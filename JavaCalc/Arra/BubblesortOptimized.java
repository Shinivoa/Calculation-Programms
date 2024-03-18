package Arra;

public class BubblesortOptimized {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        int anzahl, merke;
        int verkürzung = 1;
        boolean sortiert;
        int[] einArray = new int[1000000];
        anzahl = einArray.length;
        for (int i = 0; i < anzahl; i++) {
            einArray[i] = (int) (Math.random() * einArray.length * 10 + 1);
        }

        do {
            sortiert = true;
            verkürzung++;
            for (int i = 0; i <= anzahl - verkürzung; i++) {
                if (einArray[i + 1] < einArray[i]) {
                    // Tausche
                    merke = einArray[i];
                    einArray[i] = einArray[i + 1];
                    einArray[i + 1] = merke;
                    // Es wurde getauscht
                    sortiert = false;
                }
            }
        } while (!sortiert);
        // Ausgabe
        for (int i : einArray) {
            System.out.print(i + " ");
            long endtime = System.currentTimeMillis();
            long enxtime = endtime - starttime;
            System.out.println("");
            System.out.println("Das Program wurde in " + enxtime + " Millisek ausgefürt." + "");
        }
    }
}
