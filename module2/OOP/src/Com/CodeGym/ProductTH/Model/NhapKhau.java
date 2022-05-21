package Com.CodeGym.ProductTH.Model;

public class NhapKhau extends Product{
    private Double giaNhapKhau;
    private String tinhThanhNhap;
    private Double thueNhapKhau;


    public NhapKhau(int id, String maSanPham, String name, Double price, int among, String nhaSanXuat, Double giaNhapKhau, String tinhThanhNhap, Double thueNhapKhau) {
        super(id, maSanPham, name, price, among, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public Double getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(Double giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public Double getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(Double thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return super.toString()+ "," + giaNhapKhau + "," + tinhThanhNhap + "," + thueNhapKhau;
    }
}
