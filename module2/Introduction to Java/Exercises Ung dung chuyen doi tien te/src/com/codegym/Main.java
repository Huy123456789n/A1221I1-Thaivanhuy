package com.codegym;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD");
        USD = scanner.nextDouble();
        double convert = USD * VND;
        System.out.println(convert);


    }
}
