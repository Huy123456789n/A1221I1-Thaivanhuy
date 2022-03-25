package com.codegym;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Prime");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println("Is NOT a prime");
        } else {
            int i =2;
            boolean check = true;
            while (i <=Math.sqrt(number)) {
                if(number%2 == 0) {
                    check = false;
                    break;
                }
            } if (check) {
                System.out.println("is a Prime");
            } else {
                System.out.println("Is NOT a prime");
            }
        }
    }
}
