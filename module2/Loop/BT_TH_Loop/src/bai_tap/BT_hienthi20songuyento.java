package bai_tap;

import java.util.Scanner;

public class BT_hienthi20songuyento {
    public static void main(String[] args) {
        int number;
        int count = 0;
        int N = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số Nguyên Tố");
        number = scanner.nextInt();
        if (number >= 1) {
            System.out.println("số nguyên tố là:");
            System.out.println(2);
            for (int i = 2; i <= number; ) {
                for (int j = 2; j <= Math.sqrt(N); j++) {
                    if (N % 2 == 0) {
                        count = 1;
                        break;
                    }
                }
                if (count != 1) {
                    System.out.println(N);
                    i++;
                }
                count = 0;
                N++;
            }
        }
    }
}



