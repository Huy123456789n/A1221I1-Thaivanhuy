package Com.CodeGym.ProductTH.Model;

public abstract class Product {
    private int id;
    private String maSanPham;
    private String name;
    private Double price;
    private int among;
    private String nhaSanXuat;

    public Product() {

    }

    public Product(int id, String maSanPham, String name, Double price, int among, String nhaSanXuat) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.name = name;
        this.price = price;
        this.among = among;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAmong() {
        return among;
    }

    public void setAmong(int among) {
        this.among = among;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s",id,maSanPham,name,price,among,nhaSanXuat);
    }
}
