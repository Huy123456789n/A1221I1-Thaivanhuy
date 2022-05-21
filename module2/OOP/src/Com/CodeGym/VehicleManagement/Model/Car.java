package Com.CodeGym.VehicleManagement.Model;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable {
    private int SoChongoi;
    private String KieuXe;

    public Car(String bienkiemsoat, String hangsanxuat, int namSanXuat, String chusohuu, int soChongoi, String kieuXe) {
        super(bienkiemsoat, hangsanxuat, namSanXuat, chusohuu);
        this.SoChongoi = soChongoi;
        this.KieuXe = kieuXe;
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

    @Override
    public String toString() {
        return getBienkiemsoat() + ","
                + getHangsanxuat()+ ","
                +getNamSanXuat()+ ","
               + getChusohuu()+ ","
                + getSoChongoi()+ ","
                + getKieuXe();
    }
}
