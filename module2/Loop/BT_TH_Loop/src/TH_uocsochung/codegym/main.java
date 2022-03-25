package TH_uocsochung.codegym;

import java.util.Scanner;
// TH Tìm ước số chung lớn nhất
public class main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a");
        a = sc.nextInt();
        System.out.println("nhập số b");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor:");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("greatest common factor" + a);
    }
}
