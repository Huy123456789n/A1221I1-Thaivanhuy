package Baitap;
import java.util.Scanner;
public class timgiatrinhonhattrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhấp size");
        int size= scanner.nextInt();
        int[] array = new int[size];
        for (int i =0; i<size;i++) {
            System.out.println("nhập element"+ (i +1));
            array[i] = scanner.nextInt();}
        int min = array[0];
        for (int i=0;i< args.length;i++) {
            if (array[i] <min) {
                min = array[i];
            }
            System.out.println("Giá trị nhỏ nhất" + min);
        }
    }
}
