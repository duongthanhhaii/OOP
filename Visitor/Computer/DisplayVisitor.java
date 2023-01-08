package Visitor.Computer;

public class DisplayVisitor implements Visitor{
    @Override
    public void visit(Computer c) {
        System.out.println("Computer");
    }

    @Override
    public void visit(Mouse m) {
        System.out.println("Mouse");
    }

    @Override
    public void visit(Keyboard k) {
        System.out.println("Keyboard");
    }

    @Override
    public void visit(Monitor m) {
        System.out.println("Monitor");
    }
}
