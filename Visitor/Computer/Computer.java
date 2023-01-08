package Visitor.Computer;

import java.util.List;

public class Computer implements ComputerPart{
    private ComputerPart[] computerParts;

    public Computer(ComputerPart[] computerParts) {
        this.computerParts = computerParts;
    }

    @Override
    public void accept(Visitor v) {
        for (ComputerPart c : computerParts) {
            c.accept(v);
        }
        v.visit(this);
    }
}
