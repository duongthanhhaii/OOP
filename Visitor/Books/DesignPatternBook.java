package Visitor.Books;

public class DesignPatternBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "DesignPattern Book";
    }

    String getBestSeller() {
        return "Head First";
    }
}
