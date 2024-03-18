package Arra;

import java.util.Random;

public class Bubblesort {
    public static void main(String[] args) {

        int t = 0;
        boolean sortiert;
        int[] einArray = new int[100000];
        int anzahl = einArray.length;
        int n = 1;
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < anzahl; i++) {
            einArray[i] = (int) (Math.random() * einArray.length * 10 + 1);
        }

        do {
            sortiert = true;
            n++;
            for (int i = 0; i <= einArray.length - n; i++) {
                if (einArray[i + 1] < einArray[i]) {
                    t = einArray[i];
                    einArray[i] = einArray[i + 1];
                    einArray[i + 1] = t;
                    sortiert = false;
                }
            }

        } while (!sortiert);

        for (int i = 0; i < einArray.length; i++) {
            System.out.print(einArray[i] + ", ");

        }

        long endtime = System.currentTimeMillis();
        long enxtime = endtime - starttime;
        System.out.println("");
        System.out.println("Das Program wurde in " + enxtime + " Millisek ausgefürt." + "");
    }
}
