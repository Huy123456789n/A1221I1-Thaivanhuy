package Baitap;
import java.util.Scanner;

public class themphantuvaomang {
    public static void main(String[] args) {
    int [] array= {10,4,6,7,8,0,0,0};
    Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chèn");
        int x = scanner.nextInt();
        System.out.println("nhập Index cần chèn");
        int index = scanner.nextInt();
        if (index > array.length - 1 || index < 0) {
                System.out.println("Không chèn được phần tử vào mảng");
            }
        array[array.length] = 0;
        for (int j =array.length-1;j>index;j--){
                    array[j-1] =array[j];
            }
        array[index] = x;
        for (int i =0; i< array.length;i++) {
            System.out.print(array[i] + " ");
        }

    }
}
