package Com.CodeGym.Product.Model;

public class HandProduct extends Product{
    private String Country;
    private String Status;

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

    public HandProduct(String country, String status) {
        Country = country;
        Status = status;
    }

    public HandProduct(int id, String name, Double price, String producer, String country, String status) {
        super(id, name, price, producer);
        Country = country;
        Status = status;
    }

    @Override
    public String toString() {
        return super.toString() + Country + "," + Status + ",";
    }
}
