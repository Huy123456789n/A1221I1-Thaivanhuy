package Com.CodeGym.VehicleManagement.Model;

public class MotoCrycle extends Vehicle{
    private String CongSuat;

    public String getCongSuat() {
        return CongSuat;
    }

    public void setCongSuat(String congSuat) {
        CongSuat = congSuat;
    }

    public MotoCrycle(String bienkiemsoat, String hangsanxuat, int namSanXuat, String chusohuu, String congSuat) {
        super(bienkiemsoat, hangsanxuat, namSanXuat, chusohuu);
        CongSuat = congSuat;
    }

    public MotoCrycle(String bienkiemsoat, String hangsanxuat, int namSanXuat, String chusohuu) {
        super(bienkiemsoat, hangsanxuat, namSanXuat, chusohuu);
    }
}
