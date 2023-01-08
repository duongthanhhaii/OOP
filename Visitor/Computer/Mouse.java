package Visitor.Computer;

public class Mouse implements ComputerPart{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
