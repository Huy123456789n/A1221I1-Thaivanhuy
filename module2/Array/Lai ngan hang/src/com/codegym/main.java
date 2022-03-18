package com.codegym;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double Money = 1.0;
        int Month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount");
        Money = input.nextDouble();
        System.out.println("Enter number of month");
        Month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage ");
        interestRate=input.nextDouble();
        double total = 0;
        for (int i = 0; i < Month; i++) {
            total += Money * (interestRate / 100) / 12 * Month;
        }
        System.out.println("Total of interest:" + total);
    }
}
