package Arra;

public class SelectionSorrt {
    public static void main(String[] args) {
        int anzhal, merke, w = 0, j;
        long starttime = System.currentTimeMillis();
        int[] einArray = new int[1000000];
        anzhal = einArray.length;
        for (int i = 0; i < einArray.length; i++) {
            int rand = (int) (Math.random() * 1000000);
            einArray[i] = rand;
        } // random number generator for random number generator
        while (w < anzhal) {
            j = w;
            for (int i = w + 1; i < anzhal; i++) {
                if (einArray[i] < einArray[j]) {
                    j = i;
                }

            }

            merke = einArray[w];
            einArray[w] = einArray[j];
            einArray[j] = merke;

            w++;
        }
        for (int i = 0; i < anzhal; i++) {
            System.out.print(einArray[i] + ",");
        }
        long endtime = System.currentTimeMillis();
        long enxtime = endtime - starttime;
        System.out.println("");
        System.out.println("Das Program wurde in " + enxtime + " Millisek ausgefürt." + "");
    }
}
