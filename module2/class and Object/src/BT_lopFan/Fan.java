package BT_lopFan;

public class Fan {
    int speed = 1;
    boolean on =false;
    double radius = 5;
    String color = "Blue";
    public Fan(int speed,double radius,String color, boolean on){
        this.speed = speed;
        this.radius = radius;
        this.on = on;
        this.color= color;
    }
    public void Fan1() {
        speed = 3;
        radius =10;
        color = "yellow";
        on = true;
    }
    public void Fan2() {
        speed = 2;
        radius =5;
        color = "blue";
        on = false;
    }

    
}
