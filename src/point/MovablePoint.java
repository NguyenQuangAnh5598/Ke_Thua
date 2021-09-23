package point;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed,float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
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
    public void setSpeed(float xSpeed,float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] getSpeed = {xSpeed,ySpeed};
        return getSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                super.toString() +
                "xSpeed = " + xSpeed +
                " , ySpeed = " + ySpeed +
                " }";
    }
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY()+ ySpeed);
        return this;
    }
}
