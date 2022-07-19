package model;

public class PayType {
    private int idThanhToan;
    private String nameThanhToan;

    public int getIdThanhToan() {
        return idThanhToan;
    }

    public void setIdThanhToan(int idThanhToan) {
        this.idThanhToan = idThanhToan;
    }

    public String getNameThanhToan() {
        return nameThanhToan;
    }

    public void setNameThanhToan(String nameThanhToan) {
        this.nameThanhToan = nameThanhToan;
    }

    public PayType(int idThanhToan, String nameThanhToan) {
        this.idThanhToan = idThanhToan;
        this.nameThanhToan = nameThanhToan;
    }
}
