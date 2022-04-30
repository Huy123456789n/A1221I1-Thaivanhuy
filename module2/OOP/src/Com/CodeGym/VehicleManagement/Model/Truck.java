package Com.CodeGym.VehicleManagement.Model;

public class Truck extends Vehicle{
    private String TrongTai;

    public String getTrongTai() {
        return TrongTai;
    }

    public void setTrongTai(String trongTai) {
        TrongTai = trongTai;
    }

    public Truck(String bienkiemsoat, String hangsanxuat, int namSanXuat, String chusohuu, String trongTai) {
        super(bienkiemsoat, hangsanxuat, namSanXuat, chusohuu);
        TrongTai = trongTai;
    }

    public Truck(String bienkiemsoat, String hangsanxuat, int namSanXuat, String chusohuu) {
        super(bienkiemsoat, hangsanxuat, namSanXuat, chusohuu);
    }
}
