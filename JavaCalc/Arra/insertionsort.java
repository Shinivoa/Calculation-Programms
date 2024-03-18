package Arra;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] zahlen = new int[100000];
        long starttime = System.currentTimeMillis();

        for (int k = 0; k < zahlen.length - 1; k++) {
            zahlen[k] = (int) (Math.random() * 100000 + 1);
        }

        for (int i = 1; i < zahlen.length; i++) {
            int key = zahlen[i];
            int j = Arrays.binarySearch(zahlen, 0, i - 1, key);
            if (j < 0) {
                j = -(j + 1);
            }
            System.arraycopy(zahlen, j, zahlen, j + 1, i - j);
            zahlen[j] = key;
        }

        for (int s = 0; s < zahlen.length; s++) {
            System.out.print(zahlen[s] + ", ");
        }

        long endtime = System.currentTimeMillis();
        long enxtime = endtime - starttime;
        System.out.println("");
        System.out.println("Das Program wurde in " + enxtime + " Millisek ausgefürt." + "");
    }
}