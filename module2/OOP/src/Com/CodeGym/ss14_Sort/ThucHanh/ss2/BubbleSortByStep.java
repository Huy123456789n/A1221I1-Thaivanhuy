package Com.CodeGym.ss14_Sort.ThucHanh.ss2;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Size");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i =0; i<size;i++ ) {
            System.out.println("Nhập element array" + i);
            int element = Integer.parseInt(scanner.nextLine());
            arr[i] = element;
        }
        System.out.println("Mảng chưa sắp xếp");
        for (int i =0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        bubbleSort(arr);
        System.out.println("mảng đã Sắp Xếp");
        for (int j =0;j< arr.length;j++) {
            System.out.print(arr[j] + " ");
        }
    } public static void bubbleSort(int[] arr){
        boolean check = true;
        for (int i =0; i< arr.length && check;i++ ) {
            check = false;
            for (int j =0;j< arr.length-1; j++) {
                if(arr[j] > arr[j +1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    check = true;
                }
            }
        }
    }
}
