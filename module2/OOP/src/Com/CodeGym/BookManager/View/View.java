package Com.CodeGym.BookManager.View;

import Com.CodeGym.BookManager.Model.BookManager;
import Com.CodeGym.BookManager.Model.Novel;
import Com.CodeGym.BookManager.Model.TextBox;
import Com.CodeGym.BookManager.Service.BookService;

import java.util.List;
import java.util.Scanner;

public class View {
    private static BookService bookService = new BookService();
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;

    public static void main(String[] args) {
        DisplayMenu();
    }

    public static void DisplayMenu() {
        while (true) {
            System.out.println("menu");
            System.out.println("1: Add New Book");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("4: Search By Name");
            System.out.println("5: Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    bookService.Delete(getId());
                    break;
                case 3:
                    Display();
                    break;
                case 4:
                    bookService.Search(getName());
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void create() {
        while (true) {
            System.out.println("Menu");
            System.out.println("1: Add Novel");
            System.out.println("2: Add TextBox");
            System.out.println("3: Return Menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    bookService.AddNew(getInformation());
                    break;
                case 2:
                    bookService.AddNew(getInformation());
                    break;
                case 3:
                    DisplayMenu();

            }
        }
    }
    public static BookManager getInformation() {
        BookManager bookManager;
        int id = 1;
        System.out.println("Nhập Tên Sách");
        String name = scanner.nextLine();
        System.out.println("Nhập Tên Tác Giả");
        String tacgia = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập mô tả");
        String mota = scanner.nextLine();
        if (choice == 1) {
            System.out.println("Nhập quốc gia");
            String country = scanner.nextLine();
            System.out.println("Nhập Trạng thái");
            String status = scanner.nextLine();
            bookManager = new Novel(id, name, tacgia, namSanXuat, price, mota, country, status);
        } else {
            System.out.println("Nhập màu");
            String color = scanner.nextLine();
            System.out.println("Nhập Số lượng");
            int quantity = Integer.parseInt(scanner.nextLine());
            bookManager = new TextBox(id, name, tacgia, namSanXuat, price, mota, color, quantity);
        }
        return bookManager;
    }

    public static int getId() {
        System.out.println("Nhập id cần tìm");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public static void Display() {
        List<BookManager> bookManage = bookService.findAll();
        for (BookManager b : bookManage) {
            if (b instanceof Novel) {
                System.out.printf(" id :" + b.getId() +
                        " Name: " + b.getName() +
                        " Tác Giả: " + b.getTacGia() +
                        " Năm Sản Xuất: " + b.getNamSanXuat() +
                        " Giá: " + b.getPrice() +
                        " Mô Tả" + b.getMoTa() +
                        " Quốc gia" + ((Novel) b).getCountry() +
                        " Trạng thái: " + ((Novel) b).getStatus() + "\n");
            } else if (b instanceof TextBox)
                System.out.printf(" id :" + b.getId() +
                        "Name: " + b.getName() +
                        "Tác Giả: " + b.getTacGia() +
                        "Năm Sản Xuất: " + b.getNamSanXuat() +
                        "Giá: " + b.getPrice() +
                        "Mô Tả" + b.getMoTa() +
                        " Màu sắc: " + ((TextBox) b).getColor() +
                        " Quantity: " + ((TextBox) b).getQuantity()+"\n");
        }
    }

    public static String getName() {
        System.out.println("Nhập tên cần tìm");
        String name = scanner.nextLine();
        return name;
    }
}
