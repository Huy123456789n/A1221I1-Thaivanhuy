package Com.CodeGym.VehicleManagement.Model;

public abstract class Vehicle {
    private String bienkiemsoat;
    private String hangsanxuat;
    private int namSanXuat;
    private String Chusohuu;

    public Vehicle(String bienkiemsoat, String hangsanxuat, int namSanXuat, String chusohuu) {
        this.bienkiemsoat = bienkiemsoat;
        this.hangsanxuat = hangsanxuat;
        this.namSanXuat = namSanXuat;
        Chusohuu = chusohuu;
    }

    public String getBienkiemsoat() {
        return bienkiemsoat;
    }

    public void setBienkiemsoat(String bienkiemsoat) {
        this.bienkiemsoat = bienkiemsoat;
    }

    public String getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChusohuu() {
        return Chusohuu;
    }

    public void setChusohuu(String chusohuu) {
        Chusohuu = chusohuu;
    }
}
