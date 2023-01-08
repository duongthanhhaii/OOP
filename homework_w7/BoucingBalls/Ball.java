package homework_w7.BoucingBalls;

public class Ball {
    private float x,y, xDelta, yDelta;
    private  int radius;

    public Ball ( float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) (speed * Math.cos(direction));
        this.yDelta = (float) (speed * Math.sin(direction));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal() {
        xDelta = - this.getxDelta();
    }

    public void reflectVertical() {
        yDelta = - this.getyDelta();
    }

    @Override
    public String toString() {
        return "Ball[(" + getX() + "," + getY() + "), speed =(" + getxDelta() + "," + getyDelta() + ")]";
    }
}
