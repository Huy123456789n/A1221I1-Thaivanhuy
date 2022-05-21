package Com.CodeGym.Product.Model;

public class Authentic extends Product{
    private String ThoiGianBaoHanh;

    public String getThoiGianBaoHanh() {
        return ThoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        ThoiGianBaoHanh = thoiGianBaoHanh;
    }

    public Authentic(String thoiGianBaoHanh) {
        ThoiGianBaoHanh = thoiGianBaoHanh;
    }

    public Authentic(int id, String name, Double price, String producer, String thoiGianBaoHanh) {
        super(id, name, price, producer);
        ThoiGianBaoHanh = thoiGianBaoHanh;
    }

    @Override
    public String toString() {
        return super.toString() + ThoiGianBaoHanh + ",";
    }
}
