package Com.CodeGym.ProductManager.model;

public class HangXachTay extends Product{
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

    public HangXachTay(Integer idProduct, String productName, double price, String producer, String country, String status) {
        super(idProduct, productName, price, producer);
        Country = country;
        Status = status;
    }
}
