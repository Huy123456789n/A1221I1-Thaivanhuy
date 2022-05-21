package Com.CodeGym.ss17_BinaryFile.BaiTap.ss1;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = -7417766801111232432L;
    private String name;
    private int id;
    private String HangSanXuat;
    private double price;
    private String MoTa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHangSanXuat() {
        return HangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        HangSanXuat = hangSanXuat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public Product(String name, int id, String hangSanXuat, double price, String moTa) {
        this.name = name;
        this.id = id;
       this.HangSanXuat = hangSanXuat;
        this.price = price;
       this.MoTa = moTa;
    }

    @Override
    public String toString() {
        return " Tên Sản Phẩm :" + name
                + " Id : " + id
                + " Hãng sản Xuất" + HangSanXuat
                + " Price " + price
                + " Mô tả " + MoTa;
    }
}
