package homework_w7;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2012, 2, 29);
        System.out.println(date1);
        System.out.println(date1.nextDay());
        System.out.println(date1.nextYear());
    }
}
