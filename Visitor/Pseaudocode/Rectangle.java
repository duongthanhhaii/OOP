package Visitor.Pseaudocode;

public class Rectangle implements Shape {
    protected int x;
    protected int y;
    protected int h;
    protected int w;

    public Rectangle(int x, int y, int h, int w) {
        this.x=x;
        this.y=y;
        this.h=h;
        this.w=w;
    }


    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.printf("(%d,%d), height = %d, width = %d", x,y,h,w);
    }

    @Override
    public String accept(Visitor v) {
        return v.visitRectangle(this);
    }
}
