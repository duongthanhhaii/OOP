package Visitor.Pseaudocode;

public class Circle implements Shape {
    protected int x;
    protected int y;
    protected int r;

    public Circle(int x, int y, int r) {
        this.x=x;
        this.y=y;
        this.r=r;
    }


    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.printf("(%d, %d), radius = %d", x, y, r);
    }

    @Override
    public String accept(Visitor v) {
        return v.visitCircle(this);
    }
}
