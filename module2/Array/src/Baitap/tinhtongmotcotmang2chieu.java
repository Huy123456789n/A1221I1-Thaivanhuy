package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class tinhtongmotcotmang2chieu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size Cột");
        int sizecot = scanner.nextInt();
        System.out.println("Enter Size Dòng");
        int sizedong = scanner.nextInt();
        int[][] array = new int[sizecot][sizedong];
        for (int i = 0; i < sizecot; i++) {
            for (int j = 0; j < sizedong; j++) {
                System.out.println("Enter element array");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < sizecot; i++) {
            for (int j = 0; j < sizedong; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i =0;i<array[0].length;i++) {
            int total =0;
            for (int j=0;j<array.length;j++){
                total +=array[j][i];
                }
            System.out.println("Cột " + i +" :" + total);
            }
        }
    }

