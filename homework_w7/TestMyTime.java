package homework_w7;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(10,0,10);
        System.out.println(time1);
        System.out.println(time1.nextSecond());
        System.out.println(time1.nextMinute());
        System.out.println(time1.previousSecond());
        System.out.println(time1.previousMinute());
        System.out.println(time1.previousHour());
    }
}
