package com.deniszacharov;

/*
 Создать 2-мерный массив (матрица) M*N и заполнить его случайными числами.
  Отсортировать числа по возрастанию, чтобы с левом верхнем углу было самое маленькое число,
  справа от него следующее по значению, итд, в правом нижнем углу самое большое.
 */

import java.util.Arrays;
import java.util.Random;
public class SortArray {
    int n = 5;
    int m = 5;
    int max = 10;
    int min = 5;
    int count = 0;
    int[][] matrix = new int[n][m];
    int[] array = new int[n * m];

    public static void main(String[] args) {
        SortArray mass = new SortArray();
        mass.сreateArrayRandom();
        mass.sortAndPrintArray();

    }

    private void сreateArrayRandom() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max) + min;
        }
    }

    private void sortAndPrintArray() {
        Arrays.sort(array);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = array[count++];
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}
