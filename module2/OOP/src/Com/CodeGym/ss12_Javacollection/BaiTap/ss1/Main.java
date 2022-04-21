package Com.CodeGym.ss12_Javacollection.BaiTap.ss1;

import java.util.Scanner;

public class Main {
    public static ProductManager productManager = new ProductManager();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (!false) {
            System.out.println("ProDuct");
            System.out.println("1: Thêm Sản phẩm");
            System.out.println("2: Xóa Sản phẩm");
            System.out.println("3: Sửa sản phẩm");
            System.out.println("4: Hiển thị danh sách sản phẩm");
            System.out.println("5: tìm kiếm sản phẩm");
            System.out.println("6: sắp xếp sản phẩm");
            System.out.println("7: Exits");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    productManager.addProduct(ProductInformation());
                    break;
                case 2:
                    productManager.delete(Id());
                    break;
                case 3:
                    productManager.Repair(Id());
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.search(Id());
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
        }
    }
    private static int Id() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    private static Product ProductInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter among");
        int among = Integer.parseInt(sc.nextLine());
        Product product = new Product(id,name,among);
        return product;
    }

}
