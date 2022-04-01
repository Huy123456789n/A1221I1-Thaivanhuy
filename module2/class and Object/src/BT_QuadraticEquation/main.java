package BT_QuadraticEquation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        double a = scanner.nextDouble();
        System.out.println("Nhập b");
        double b = scanner.nextDouble();
        System.out.println("Nhập c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("Kết quả :" + delta);
        if (delta >= 0) {
            System.out.println("Có 2 nghiệm :" + quadraticEquation.getRoot1() + "and" + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Có 1 nghiệm :" + quadraticEquation.getRoot1());

        } else {
            System.out.println("The equation has no roots");
        }
    }
}
