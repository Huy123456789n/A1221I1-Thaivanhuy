package Com.CodeGym.ss17_BinaryFile.BaiTap.ss1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   static BinaryFile binaryFile = new BinaryFile();
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice =0;
        while (true) {
            System.out.println("Menu");
            System.out.println("1: Thêm sản Phẩm");
            System.out.println("2: Hiển thị sản phẩm");
            System.out.println("3: Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    binaryFile.WriteFile(GetInformation());
                    break;
                case 2:
                  List<Product> products = binaryFile.readFile();
                    for (Product list: products) {
                        System.out.println(list);
                    }
                    break;
            }
        }

    }
    public static List<Product> GetInformation() {
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Hãng Sản Xuất");
        String HangSanXuat = scanner.nextLine();
        System.out.println("Nhập Giá");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập Mô tả");
        String Mota = scanner.nextLine();
        List<Product> products = new ArrayList<>();
        products.add(new Product(name,id,HangSanXuat,price,Mota));
        return products;
    }
}
