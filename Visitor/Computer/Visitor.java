package Visitor.Computer;

public interface Visitor {
    void visit(Computer c);
    void visit(Mouse m);
    void visit(Keyboard k);
    void visit(Monitor m);
}
