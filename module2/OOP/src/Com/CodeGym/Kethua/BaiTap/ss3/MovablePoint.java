package Com.CodeGym.Kethua.BaiTap.ss3;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }
    public MovablePoint(float xSpeed, float ySpeed,float x, float y) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setXYSpeed(float xSpeed, float ySpeed){
        this.xSpeed= xSpeed;
        this.ySpeed= ySpeed;
    }
    public float[] getXYSpeed() {
        float[] arr2 = {xSpeed,ySpeed};
        return arr2;
    }

    @Override
    public String toString() {
        return " x = " + getX()
        + " y = " + getY()
        + " xSpeed = " +  xSpeed
        + " ySpeed = " + ySpeed;
     }
     public MovablePoint Move(float x, float y) {
       x += xSpeed;
       y += ySpeed;
       return this;
     }
}
