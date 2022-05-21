package Com.CodeGym.ProductManager.model;

public class HangChinhHang extends Product{
    private String WarrantyPeriod;

    public HangChinhHang(Integer idProduct, String productName, double price, String producer, String warrantyPeriod) {
        super(idProduct, productName, price, producer);
        WarrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyPeriod() {
        return WarrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        WarrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return getIdProduct() + ","
                + getProductName() + ","
                + getPrice() + ","
                + getProducer() +","
                + getWarrantyPeriod() +",";
    }
}
