package Visitor.Pseaudocode;

public interface Visitor {
    String visitDot(Dot d);
    String visitCircle (Circle c);
    String visitRectangle(Rectangle r);
}
