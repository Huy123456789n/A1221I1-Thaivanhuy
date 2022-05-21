package Com.CodeGym.ProductTH.Model;

public class XuatKhau extends Product{
    private Double giaXuatKhau;
    private String quocGia;


    public XuatKhau(int id, String maSanPham, String name, Double price, int among, String nhaSanXuat, Double giaNhapKhau, String quocGia) {
        super(id, maSanPham, name, price, among, nhaSanXuat);
        this.giaXuatKhau = giaNhapKhau;
        this.quocGia = quocGia;
    }

    public Double getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(Double giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return super.toString() + "," + giaXuatKhau + "," + quocGia;
    }
}
