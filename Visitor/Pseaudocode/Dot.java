package Visitor.Pseaudocode;

public class Dot implements Shape {
    protected int x;
    protected int y;

    public Dot(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.printf("(%d,%d)", this.x, this.y);
    }

    @Override
    public String accept(Visitor v) {
        return v.visitDot(this);
    }
}
