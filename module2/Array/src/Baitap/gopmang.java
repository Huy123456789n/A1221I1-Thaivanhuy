package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[array1.length + array2.length];
        int pos=0;
        for (int i = 0; i < array1.length; i++) {
            System.out.println("nhập element array1 :");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("nhập element array2 :");
            array2[i] = scanner.nextInt();
        }
        for (int element:array1
             ) {
            array3[pos] = element;
            pos++;
        }
        for (int element:array2
        ) {
            array3[pos] = element;
            pos++;
    }
        System.out.println("mảng gộp :" + (Arrays.toString(array3)));
}}

