package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        homework_2();
        homework_3();
        homework_4();

        homework_6();

    }

    static void homework_2() {
        int[][] some_array = new int[6][5];

        some_array[2][0] = -19;
        some_array[0][3] = 4;
        some_array[3][2] = 7;
        some_array[5][3] = 22;

        for (int[] ints : some_array) {
            for (int c = 0; c < 5; c++) {
                System.out.print(ints[c] + " ");
            }
            System.out.println();
        }

    }

    static void homework_3() {
        String[][] colors = {
                {"red", "green", "pink"},
                {"blue", "turquoise", "magenta"},
                {"green", "purple", "blue"}
        };

        final String key = "green";

        for (int r = 0; r < colors.length; r++) {
            for (int c = 0; c < 3; c++) {
                if (colors[r][c].equals(key))
                    System.out.println("Row: " + r + "; Column: " + c);
            }
        }

    }

    static void homework_4() {
        int[][] another_array = {
                {2, -1, 4, 6, 129},
                {1, -34, 2, 2, 1},
                {65, -6, -10, 4, 17},
                {9, 0, -2, 3, -8}
        };
        int sum_of_rows = 0;
        int sum_of_columns = 0;
        int sum_of_all = 0;

        for (int r = 0; r < another_array.length; r++) {
            for (int c = 0; c < another_array[r].length; c++) {
                sum_of_rows += another_array[r][c];
            }
            System.out.println("Sum of row " + r + ": " + sum_of_rows);
            sum_of_rows = 0;
        }

        for (int c = 0; c < 5; c++) {
            for (int[] ints : another_array) {
                sum_of_columns += ints[c];
            }
            System.out.println("Sum of column " + c + ": " + sum_of_columns);
            sum_of_all += sum_of_columns;
            sum_of_columns = 0;
        }

        System.out.println("Sum of all: " + sum_of_all);
    }

    static void homework_6() {
        final int N = 5;
        int[][] A = new int[N][N];

        int z = 1;
        int top = 0, bottom = 4, left = 0, right = 4;

        while (z <= N * N) {
            for (int c = left, r = top; c <= right; c++) {
                A[r][c] = z;
                z++;
            }

            top++;
            for (int c = right, r = top; r <= bottom; r++) {
                A[r][c] = z;
                z++;
            }

            right--;
            for (int c = right, r = bottom; c >= left; c--) {
                A[r][c] = z;
                z++;
            }

            bottom--;
            for (int c = left, r = bottom; r >= top; r--) {
                A[r][c] = z;
                z++;
            }

            left++;
        }

        for (int[] a: A)
            System.out.println(Arrays.toString(a));

    }
}
