package Visitor.Books;

public class JavaCoreBook implements ProgramingBook{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "JavaCore Book";
    }

    public String getFavor() {
        return "JavaPrograming";
    }
}
