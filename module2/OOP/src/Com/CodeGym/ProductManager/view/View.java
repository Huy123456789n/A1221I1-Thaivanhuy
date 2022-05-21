package Com.CodeGym.ProductManager.view;

import Com.CodeGym.ProductManager.Controller.Controller;
import Com.CodeGym.ProductManager.model.HangChinhHang;

import java.io.*;
import java.util.Scanner;

public class View {
    static Scanner scanner = new Scanner(System.in);
    static boolean check = true;
    static Controller controller = new Controller();

    public static void main(String[] args) {
        while (true) {
                System.out.println("Menu");
                System.out.println("1: Add new Product");
                System.out.println("2: Delete Product");
                System.out.println("3: Display All Product");
                System.out.println("4: Search Product");
                System.out.println("5: Exit");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        controller.AddNew(getInformation());
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        System.exit(1);
                        break;
                }
            }
        }
    public static HangChinhHang getInformation() {
        int id = controller.getid() + 1;
        System.out.println("Enter ProductName");
        String name = scanner.nextLine();
        System.out.println("Enter Price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Producer");
        String producer = scanner.nextLine();
        System.out.println("WarrantyPeriod");
        String warrantyPeriod = scanner.nextLine();
        HangChinhHang hangChinhHang = new HangChinhHang(id, name, price, producer, warrantyPeriod);
        return hangChinhHang;
    }

}