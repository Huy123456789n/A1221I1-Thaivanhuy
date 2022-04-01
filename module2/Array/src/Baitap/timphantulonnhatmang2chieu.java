package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class timphantulonnhatmang2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cột ma trận");
        int m = scanner.nextInt();
        System.out.println("nhâp dòng ma trận");
        int n = scanner.nextInt();
        int[][] array = new int[m][n];
        System.out.println("nhập element");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("array[" + i + "][" + j + "]=");
                array[i][j] = scanner.nextInt();
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int max = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[m][n] > max) {
                    max = array[m][n];
                    break;
                }
            }
        }
        System.out.println("giá trị lớn nhất trong 2 mảng" + max);
    }
}