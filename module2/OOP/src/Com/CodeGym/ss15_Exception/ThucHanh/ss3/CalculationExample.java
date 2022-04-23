package Com.CodeGym.ss15_Exception.ThucHanh.ss3;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập y");
        int y = Integer.parseInt(scanner.nextLine());
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.Calc(x,y);
    }
    public void Calc(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("a =" + a);
            System.out.println("b =" + b);
            System.out.println("c =" + c);
            System.out.println("d =" + d);
        }catch (Exception e ){
            System.out.println("Xảy ra ngoại lệ" + e.getMessage());
        }
    }
}
