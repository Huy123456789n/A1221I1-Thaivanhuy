package Com.CodeGym.ss11_Stack_Queue.BaiTap.ss1;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        for (int i =0; i<name.length();i++) {
            stack.push(name.charAt(i) + "");
        }
        System.out.println("Chuỗi đảo");
        for (int i =0; i<name.length();i++) {
            System.out.print(stack.pop());
        }

}}
