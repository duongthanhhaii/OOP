package Visitor.Books;

public class BusinessBook implements Book {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return "Business Book";
    }
}
