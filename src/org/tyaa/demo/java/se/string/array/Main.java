package org.tyaa.demo.java.se.string.array;

public class Main {

    public static void main(String[] args) {
        int[][] table = new int[11][11];
        // fill the table
        // row loop
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                // the first row
                if (i == 0) {
                    // column number
                    table[i][j] = j;
                } else if (j == 0) { // the first column
                    // row number
                    table[i][j] = i;
                } else {
                    // mult. result
                    table[i][j] = i * j;
                }
            }
        }
        // print the table
        /* for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.printf("%4s", table[i][j]);
            }
            System.out.println();
        } */
        int[] array1 = {1, 5, 9};
        int[] array2 = new int[5];
        for (int currentItem : array2) {
            System.out.println(currentItem);
        }
        System.out.println("***");
        int[][] array3 = new int[4][];
        for (int[] currentItem : array3) {
            System.out.println(currentItem);
        }
        array3[2] = new int[]{100, -1000, 0, 9};
        System.out.println("***");
        for (int[] currentItem : array3) {
            // System.out.println(currentItem);
            if (currentItem != null) {
                for (int currentItem2 : currentItem) {
                    System.out.printf("%d ", currentItem2);
                }
            }
            System.out.println();
        }
    }
}
