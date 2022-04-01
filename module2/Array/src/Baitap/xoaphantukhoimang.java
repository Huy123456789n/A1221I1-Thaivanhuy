package Baitap;

import java.util.Scanner;

public class xoaphantukhoimang {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần tìm ");
        int X = scanner.nextInt();
        int indexX = 0;
        for (int i = 0; i < array.length; i++) {
            if (X == array[i]) {
                indexX = i;
                System.out.println("index :" + indexX);
                break;
            }
        }

        for (int j = indexX; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


