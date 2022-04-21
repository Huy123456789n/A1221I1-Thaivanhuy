package Com.CodeGym.ss12_Javacollection.BaiTap.ss1;

public class Product {
    private int ID;
    private String name;
    private int among;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmong() {
        return among;
    }

    public void setAmong(int among) {
        this.among = among;
    }

    public Product(int id, String name, int among) {
        this.ID = id;
        this.name = name;
        this.among = among;
    }
}
