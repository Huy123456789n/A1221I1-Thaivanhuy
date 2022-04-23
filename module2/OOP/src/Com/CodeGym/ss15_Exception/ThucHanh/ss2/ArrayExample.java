package Com.CodeGym.ss15_Exception.ThucHanh.ss2;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] arr() {
        Random rd = new Random(100);
        Integer [] array = new Integer[100];
        for (int i =0;i< 100;i++) {
            array[i] = rd.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer [] arr = arrayExample.arr();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập index");
        int x = Integer.parseInt(scanner.nextLine());
        do {
            try {
                System.out.println("index vị trí " + x + " là" + arr[x] );
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("vượt quá giới hạn mảng");
                System.out.println("Mời nhập lại : ");
                 x = Integer.parseInt(scanner.nextLine());
            }
        }while (true);

    }
}
