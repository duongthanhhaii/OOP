package Visitor.Books;

import java.util.List;

public class Test {
    static List<Book> books;
    public static void main(String[] args) {
        books = List.of(new BusinessBook(), new DesignPatternBook(), new JavaCoreBook());
        Visitor v = new VisitorImpl();

        for (Book b : books) {
            b.accept(v);
        }

    }
}
