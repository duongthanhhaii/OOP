package Visitor.Computer;

public class Keyboard implements ComputerPart{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
