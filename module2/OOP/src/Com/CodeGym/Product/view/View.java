package Com.CodeGym.Product.view;

import Com.CodeGym.Product.Model.Authentic;
import Com.CodeGym.Product.Model.HandProduct;
import Com.CodeGym.Product.Model.Product;
import Com.CodeGym.Product.Service.AuthenticService;
import Com.CodeGym.Product.Service.HandProductService;

import java.util.Scanner;
public class View<T> {
    private static AuthenticService authenticService = new AuthenticService.AuthenticServiceIlm();
    private static HandProductService handProductService = new HandProductService.HandProductServiceIlm();
    static Scanner scanner = new Scanner(System.in);
    static int choice;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu");
            System.out.println("1: AddProduct");
            System.out.println("2: DisPlayAll");
            System.out.println("3: DeleteByID");
            System.out.println("4: SearchByName");
            System.out.println("5: Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AddProduct();
                    break;
                case 2:
                    authenticService.DisplayAll();
                    break;
                case 3:
                    authenticService.Delete(getID());
                    break;
                case 4:
                    authenticService.Search(getName());
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
    public static void AddProduct() {
        while (true){
            System.out.println("Menu");
            System.out.println("1: AddNewAuthentic");
            System.out.println("2: AddNewHandProduct");
            choice = Integer.parseInt(scanner.nextLine());
            getInformation();
        }
    }
    public static void getInformation() {
        int id = 0;
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        Double price = Double.valueOf(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất");
        String Producer = scanner.nextLine();
        Product product;
        if(choice == 1) {
            System.out.println("Nhập thời gian bảo hành");
            String time = scanner.nextLine();
            product = new Authentic(id,name,price,Producer,time);
            authenticService.AddProduct(product);
        } else{
            System.out.println("Nhập Quốc gia");
            String country = scanner.nextLine();
            System.out.println("Nhập Trạng thái");
            String Status = scanner.nextLine();
            product = new HandProduct(id,name,price,Producer,country,Status);
            handProductService.AddProduct(product);
        }
    }
    private static int getID() {
        System.out.println("Nhập Id cần Xóa");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }
    private static String getName() {
        System.out.println("Nhập Tên sản phẩm cần tìm");
        String name = scanner.nextLine();
        return name;
    }
}
