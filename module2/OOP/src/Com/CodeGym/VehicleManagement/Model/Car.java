package Com.CodeGym.VehicleManagement.Model;

public class Car extends Vehicle{
    private int SoChongoi;
    private String KieuXe;

    public Car(String bienkiemsoat, String hangsanxuat, int namSanXuat, String chusohuu, int soChongoi, String kieuXe) {
        super(bienkiemsoat, hangsanxuat, namSanXuat, chusohuu);
        SoChongoi = soChongoi;
        KieuXe = kieuXe;
    }


    public int getSoChongoi() {
        return SoChongoi;
    }

    public void setSoChongoi(int soChongoi) {
        SoChongoi = soChongoi;
    }

    public String getKieuXe() {
        return KieuXe;
    }

    public void setKieuXe(String kieuXe) {
        KieuXe = kieuXe;
    }

    public Car(String bienkiemsoat, String hangsanxuat, int namSanXuat, String chusohuu) {
        super(bienkiemsoat, hangsanxuat, namSanXuat, chusohuu);
    }
}
