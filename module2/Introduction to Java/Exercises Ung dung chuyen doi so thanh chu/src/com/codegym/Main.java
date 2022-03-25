package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = input.nextInt();
        if (number < 10)
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("night");
                    break;
                default:
                    System.out.println("Out of ability");

            }
        if (number < 20) {
            int donvi = number % 10;
            switch (donvi) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
                default:
                    System.out.println("Out of ability");
            }
        }
        if(number<100) {
            int chuc = number/10;
            int donvi = number%10;
            switch (chuc) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("twe");
                    break;
                case 3:
                    System.out.println("thirty");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("fifty");
                    break;
                case 6:
                    System.out.println("sixty");
                    break;
                case 7:
                    System.out.println("seventy");
                    break;
                case 8:
                    System.out.println("eighty");
                    break;
                case 9:
                    System.out.println("ninety");
                    break;
            } switch (donvi) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("night");
                    break;
            }
        }
    }
}
