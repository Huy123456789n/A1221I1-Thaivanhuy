package bai_tap;

import java.util.Scanner;

public class BT_spremi_nho_hon_100 {
    public static void main(String[] args) {
        int Prime;
        boolean check = false;
        int n = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Prime Number");
        Prime = scanner.nextInt();
        if (Prime < n) {
            System.out.println("This is NOT prime");
        } else if(Prime<100) {
            for (int i = 2; i <= Prime-1; i++) {
                if (Prime % 2 == 0) {
                    check = false;
                } else {
                    check = true;
                }
            }
            if (check) {
                System.out.println(Prime + " This is a Prime");
            } else {
                System.out.println(Prime + "This is NOT a Prime");
            }
        } else {
            System.out.println("Vượt quá 100");
        }
    }
}
