package Thuc_Hanh;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = scanner.nextDouble();
        System.out.println("Enter the height");
        double height = scanner.nextDouble();
        lophinhchunhat Lophinhchunhat =new lophinhchunhat(width,height);
        System.out.println("your rectangle \n" + Lophinhchunhat.display());
        System.out.println("Perimeter of the Rectangle: " + Lophinhchunhat.getPerimeter());
        System.out.println("Area of the Rectangle :" + Lophinhchunhat.getArea());
    }
}
