package BT_Triangle;

public class Triangle {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 =side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea() {
        double P = (side1 + side2 + side3)/2;
        double h = 2*(Math.sqrt(P*(P-side1)*(P-side2)*(P-side3))/2);
        double S =(side1*h)/2;
        return S;
    }
    public double getPerimeter() {
        double p = side1 + side2 + side3;
        return p;
    }

    @Override
    public String toString() {
        return "a = " + side1
                + " b = "+ side2
                + " c = " + side3
                +" Diện tích là : " + getArea()
                + " Chu Vi là :" + getPerimeter();
    }
}
