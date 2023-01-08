package hw5_MyPoint;

public class MyPoint {
    private int x,y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint( int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] toado = new int[2];
        toado[0] = getX();
        toado[1] = getY();
        return toado;
    }

    public void setXY (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }

    public double distance(int x, int y) {
        int xDis = this.x - x;
        int yDis = this.y - y;
        return Math.sqrt(xDis*xDis + yDis*yDis);
    }

    public double distance(MyPoint another) {
        int xDis = this.x - another.x;
        int yDis = this.x - another.y;
        return Math.sqrt(xDis*xDis + yDis*yDis);
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y*this.y);
    }
}
