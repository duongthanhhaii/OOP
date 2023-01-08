package Visitor.Books;

public class VisitorImpl implements Visitor{
    @Override
    public void visit(BusinessBook book) {
        System.out.println(book.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println(book.getResource());
        System.out.println(book.getBestSeller());
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println(book.getResource());
        System.out.println(book.getFavor());
    }
}
