package BT_loppointandMoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public float[] getSpeed() {
        float[] arr = getXY();
        arr[2] = xSpeed;
        arr[3] = ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        return "x = " + getX()
                + "y" + getY()
                + "xSpeed" + xSpeed
                + "ySpeed" + ySpeed
                + super.toString();
    }

    public MovablePoint move() {
        float x = 0.0f;
        float y = 0.0f;
        x += xSpeed;
        y += ySpeed;
        setXY(x,y);
        return this;
    }
}
