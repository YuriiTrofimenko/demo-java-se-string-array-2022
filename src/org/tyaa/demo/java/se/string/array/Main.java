package org.tyaa.demo.java.se.string.array;

public class Main {

    public static void main(String[] args) {
        // row loop
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                // the first row
                if (i == 0) {
                    // column number
                    System.out.printf("%4s", j);
                } else if (j == 0) { // the first column
                    // row number
                    System.out.printf("%4s", i);
                } else {
                    // mult. result
                    System.out.printf("%4s", i * j);
                }
            }
            System.out.println();
        }
    }
}
