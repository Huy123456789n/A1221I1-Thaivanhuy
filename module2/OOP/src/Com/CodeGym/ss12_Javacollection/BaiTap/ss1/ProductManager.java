package Com.CodeGym.ss12_Javacollection.BaiTap.ss1;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public ProductManager() {
    }
    public ProductManager(ArrayList product) {
        this.products = product;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void display() {
        for (int i =0; i< products.size();i++) {
            Product product = products.get(i);
            System.out.println(" ID : " + product.getID()+"\n"+ " Name : "
                    + product.getName()+"\n"+ " Among : "
                    + product.getAmong());
        }
    }
    public void delete(int id) {
        for (int i =0; i<products.size();i++) {
            int index = -1;
            Product product = products.get(i);
            if(product.getID() == id) {
                index = i;
                products.remove(index);
                }
            }
        }
        public void Repair(int id) {
        for (int i =0; i< products.size();i++) {
            int index = -1;
            Product product = products.get(i);
            if(product.getID()== id ){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập tên mới");
                String name = scanner.nextLine();
                System.out.println("Nhập số lượng sản phẩm");
                int among = Integer.parseInt(scanner.nextLine());
                product.setName(name);
                product.setAmong(among);
            }
        }
        }
        public void search(int id) {
        for (int i =0; i< products.size();i++) {
            Product product = products.get(i);
            if (product.getID()==id) {
                System.out.println(" ID : " + product.getID()+"\n"+ " Name : "
                        + product.getName()+"\n"+ " Among : "
                        + product.getAmong());
            }
        }
        }
    }
