package Com.CodeGym.BookManager.Model;

public class TextBox extends BookManager{
    private String Color;
    private int Quantity;

    public TextBox(String color, int quantity) {
        Color = color;
        Quantity = quantity;
    }

    public TextBox(int id, String name, String tacGia, int namSanXuat, Double price, String moTa, String color, int quantity) {
        super(id, name, tacGia, namSanXuat, price, moTa);
        Color = color;
        Quantity = quantity;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString() + "," + Color + "," + Quantity + "," + getClass().getSimpleName();
    }
}
