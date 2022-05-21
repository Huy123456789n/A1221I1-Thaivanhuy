package Com.CodeGym.Product.Model;

public abstract class Product {
    private int id;
    private String name;
    private Double price;
    private String Producer;
    public Product(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

    public Product(int id, String name, Double price, String producer) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.Producer = producer;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,",id,name,price,Producer);
    }
}
