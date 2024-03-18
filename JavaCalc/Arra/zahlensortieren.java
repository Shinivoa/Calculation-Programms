package Arra;

import java.util.Arrays;

public class zahlensortieren {
    public static void main(String[] args) {

        int[] unsortiert = { 7, 42, 3, 31, 24, 17 };

        Arrays.sort(unsortiert);

        for (int sortiert : unsortiert) {
            System.out.print(sortiert + ", ");
        }

    }
}
