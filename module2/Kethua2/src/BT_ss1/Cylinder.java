package BT_ss1;

public class Cylinder extends Circle{
    private double height = 2.0;
    public Cylinder() {
    }
    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double volume() {
        return   getArea() * height;
    }

    @Override
    public String toString() {
        return "height"
                + getHeight()
                + "Volume ="
                + volume()
                + super.toString();
    }
}
