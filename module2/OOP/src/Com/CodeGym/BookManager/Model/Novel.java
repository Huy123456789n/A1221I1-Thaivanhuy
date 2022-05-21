package Com.CodeGym.BookManager.Model;

public class Novel extends BookManager{
    private String Country;
    private String Status;

    public Novel(String country, String status) {
        Country = country;
        Status = status;
    }

    public Novel(int id, String name, String tacGia, int namSanXuat, Double price, String moTa, String country, String status) {
        super(id, name, tacGia, namSanXuat, price, moTa);
        Country = country;
        Status = status;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return super.toString() + "," + Country + "," + Status + "," + getClass().getSimpleName() ;
    }
}
