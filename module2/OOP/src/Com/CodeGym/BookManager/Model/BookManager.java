package Com.CodeGym.BookManager.Model;

public class BookManager {
    private int id;
    private String name;
    private String TacGia;
    private int NamSanXuat;
    private Double price;
    private String MoTa;
    public BookManager() {

    }
    public BookManager(int id, String name, String tacGia, int namSanXuat, Double price, String moTa) {
        this.id = id;
        this.name = name;
        TacGia = tacGia;
        NamSanXuat = namSanXuat;
        this.price = price;
        MoTa = moTa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public int getNamSanXuat() {
        return NamSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        NamSanXuat = namSanXuat;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s",id,name,TacGia,NamSanXuat,price,MoTa);
    }
}
