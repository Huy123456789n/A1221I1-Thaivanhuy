package Com.CodeGym.ProductTH.Service;

import Com.CodeGym.ProductTH.Model.NhapKhau;
import Com.CodeGym.ProductTH.Model.Product;
import Com.CodeGym.ProductTH.Model.XuatKhau;
import Com.CodeGym.ProductTH.Until.FileHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();
    private static FileHelper fileHelper = new FileHelper();
    public ProductService() {
        products = mapToProduct();
    }

    public void AddProduct(Product product) {
        int lastID = 1;
        if(!products.isEmpty()){
            lastID = products.get(products.size() -1).getId();}
            product.setId(lastID +1);
            products.add(product);
        fileHelper.Writer("OOP/src/Com/CodeGym/ProductTH/Data/Product.csv", true, Collections.singletonList(product));
    }
    public List<Product> findAdd() {
        return products;
    }
    public void Delete(String codeProduct) {
        for (int i =0;i< products.size();i++) {
            if (codeProduct.equals(products.get(i).getMaSanPham())){
                System.out.println("Mã sản Phẩm tồn tại, Bạn có Muốn xóa");
                System.out.println("1: có" + "\n" + "2: Không ");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    products.remove(i);
                    fileHelper.Writer("OOP/src/Com/CodeGym/ProductTH/Data/Product.csv", false, products);
                    System.out.println("Delete success");
                }
            }
        }
    }
    public void SearchByCode(String codeProduct) {
        for (int i =0; i< products.size();i++) {
            if (codeProduct.equals(products.get(i).getMaSanPham())){
                System.out.println(products.get(i));
            }
        }
    }
    public void SearchByName(String name) {
        for (int i =0;i< products.size();i++) {
            if (name.equals(products.get(i).getName())){
                System.out.println(products.get(i));
            }
        }
    }
    public List mapToProduct() {
        Product product;
        List<Product> result = new ArrayList<>();
        List<String> line = fileHelper.Read("OOP/src/Com/CodeGym/ProductTH/Data/Product.csv");
        for (String lines : line) {
            String[] temp = lines.split(",");
            int id = Integer.parseInt(temp[0]);
            String codeProduct = temp[1];
            String name = temp[2];
            Double price = Double.parseDouble(temp[3]);
            int among = Integer.parseInt(temp[4]);
            String nhaSanXuat = temp[5];
            if (lines.length() == 9) {
                Double giaNhapKhau = Double.parseDouble(temp[6]);
                String tinhThanhNhap = temp[7];
                Double thue = Double.parseDouble(temp[8]);
                product = new NhapKhau(id, codeProduct, name, price, among, nhaSanXuat, giaNhapKhau, tinhThanhNhap, thue);
                result.add(product);
            } else {
                Double giaXuatKhau = Double.parseDouble(temp[6]);
                String quocGia = temp[7];
                product = new XuatKhau(id, codeProduct, name, price, among, nhaSanXuat, giaXuatKhau, quocGia);
                result.add(product);
            }
        }
        return result;
    }
}
