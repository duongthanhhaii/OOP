package hw5_MyPoint;

public class MyLine {
    private MyPoint begin, end;

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyLine (int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getX1() {
        return begin.getX();
    }

    public int getY1() {
        return begin.getY();
    }

    public int getX2() {
        return end.getX();
    }

    public int getY2() {
        return end.getY();
    }

    public void setX1(int x) {
        begin.setX(x);
    }

    public void setY1(int y) {
        begin.setY(y);
    }

    public void setX1Y1(int x, int y) {
        begin.setXY(x, y);
    }

    public void setX2(int x) {
        end.setX(x);
    }

    public void setY2(int y) {
        end.setY(y);
    }

    public void setX2Y2(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        int xDis = begin.getX() - end.getX();
        int yDis = begin.getY() - end.getY();
        return Math.atan2(yDis,xDis);
    }

    @Override
    public String toString() {
        return String.format("MyLine[begin=%s, end = %s", begin.toString(), end.toString());
    }
}
