package Visitor.Computer;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        ComputerPart[] computerParts = new ComputerPart[]{new Keyboard(), new Monitor(), new Mouse()};
        ComputerPart computer = new Computer(computerParts);
        Visitor v = new DisplayVisitor();

        computer.accept(v);

    }
}
