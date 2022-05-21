package Com.CodeGym.ProductTH.View;


import Com.CodeGym.ProductTH.Model.NhapKhau;
import Com.CodeGym.ProductTH.Model.Product;
import Com.CodeGym.ProductTH.Model.XuatKhau;
import Com.CodeGym.ProductTH.Service.ProductService;

import java.util.List;
import java.util.Scanner;

public class View {
    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;

    public static void main(String[] args) {
        DisplayMenu();
    }

    public static void DisplayMenu() {
        while (true) {
            System.out.println("Menu Main");
            System.out.println("1: Add New Product");
            System.out.println("2: Delete");
            System.out.println("3: DisplayAll");
            System.out.println("4: Search");
            System.out.println("5: Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AddNew();
                    break;
                case 2:
                    Display();
                    productService.Delete(getCodeProduct());
                    break;
                case 3:
                    Display();
                    break;
                case 4:
                    SearchMain();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void AddNew() {
        while (true) {
            System.out.println("Menu");
            System.out.println("1: Thêm sản phẩm nhập khẩu");
            System.out.println("2: Thêm sản phẩm xuất khẩu");
            System.out.println("3: Return Menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.AddProduct(getInformation());
                    break;
                case 2:
                    productService.AddProduct(getInformation());
                    break;
                case 3:
                    DisplayMenu();
            }
        }

    }

    public static Product getInformation() {
        Product product;
        int id = 1;
        System.out.println("Nhập Mã sản phẩm");
        String codeProduct = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá bán");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng");
        int among = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất");
        String producer = scanner.nextLine();
        if (choice == 1) {
            System.out.println("Nhập giá Nhập khẩu");
            Double giaNhapKhau = Double.parseDouble(scanner.nextLine());
            System.out.println("Tỉnh thành nhập ");
            String tinhThanh = scanner.nextLine();
            System.out.println("Thuế nhập khẩu");
            Double thue = Double.parseDouble(scanner.nextLine());
            product = new NhapKhau(id, codeProduct, name, price, among, producer, giaNhapKhau, tinhThanh, thue);
            return product;
        } else {
            System.out.println("Giá xuất khẩu");
            Double xuatKhau = Double.parseDouble(scanner.nextLine());
            System.out.println("Quốc gia nhập ");
            String country = scanner.nextLine();
            product = new XuatKhau(id, codeProduct, name, price, among, producer, xuatKhau, country);
            return product;
        }
    }

    public static void Display() {
        List<Product> product = productService.findAdd();
        for (Product p : product) {
            if (p instanceof NhapKhau) {
                System.out.println("id: " + p.getId()
                        + " Mã SP:" + p.getMaSanPham()
                        + " Tên SP: " + p.getName()
                        + " Giá Bán: " + p.getPrice()
                        + " Số Lượng:" + p.getAmong()
                        + " Nhà sản Xuất: " + p.getNhaSanXuat()
                        + " Giá nhập khẩu :" + ((NhapKhau) p).getGiaNhapKhau()
                        + " tỉnh thành nhập: " + ((NhapKhau) p).getTinhThanhNhap()
                        + " Thuế:" + ((NhapKhau) p).getThueNhapKhau());
            } else if (p instanceof XuatKhau) {
                System.out.println("id: " + p.getId()
                        + " Mã SP:" + p.getMaSanPham()
                        + " Tên SP: " + p.getName()
                        + " Giá Bán: " + p.getPrice()
                        + " Số Lượng:" + p.getAmong()
                        + " Nhà sản Xuất: " + p.getNhaSanXuat()
                        + " Giá Xuất khẩu: " + ((XuatKhau) p).getGiaXuatKhau()
                        + " Quốc gia :" + ((XuatKhau) p).getQuocGia());
            }
        }
    }
    public static String getCodeProduct(){
        System.out.println("Nhập Mã Sản Phẩm");
        String codeProduct = scanner.nextLine();
        return codeProduct;
    }
    public static String getName() {
        System.out.println("Nhập tên sản phẩm cần tìm");
        String name = scanner.nextLine();
        return name;
    }
    public static void SearchMain(){
        System.out.println("Bạn muốn seach theo Tên hay Mã");
        System.out.println("1: Theo tên");
        System.out.println("2: Theo Mã");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                productService.SearchByName(getName());
                break;
            case 2:
                productService.SearchByCode(getCodeProduct());
                break;
        }
    }
}
