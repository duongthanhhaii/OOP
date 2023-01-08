package Visitor.Computer;

public class Monitor implements ComputerPart{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
