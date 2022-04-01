package BT_Triangle;

import java.util.Scanner;

public class Shape extends Triangle {
    Scanner scanner = new Scanner(System.in);
    private double number = scanner.nextDouble();
    private String color = scanner.nextLine();

    public Shape() {
    }
    public Shape(double number, String color, double side1, double side2, double side3) {
        super(side1, side2, side3);
        this.number= number;
        this.color=color;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setScanner() {
        setSide1(number);
        setSide2(number);
        setSide3(number);
    }
}
