package Com.CodeGym.ProductManager.model;

public abstract class Product {
    private Integer idProduct;
    private String ProductName;
    private double Price;
    private String Producer;

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

    public Product(Integer idProduct, String productName, double price, String producer) {
        this.idProduct = idProduct;
        this.ProductName = productName;
        this.Price = price;
        this.Producer = producer;
    }

    @Override
    public String toString() {
        return idProduct + ","
                + getProductName() + ","
                + getPrice() + ","
                + getProducer() + ",";
    }
}
