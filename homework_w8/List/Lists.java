package List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {
    public static void insertFirst (ArrayList<Integer> list, int value ) {
        list.add(0, value);
    }

    public static void insertLast (ArrayList<Integer> list, int value) {
        list.add(list.size() -1, value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird (ArrayList<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil (ArrayList<Integer> list) {
        list.remove("666");
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> square = new ArrayList<>();
        for (int i=1; i<=10; i++) {
            square.add(i*i);
        }
        return square;
    }

    public static boolean contains (ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy (ArrayList<Integer> source, ArrayList<Integer> target) {
        if ( target.isEmpty() ) {
            for (int i = 0; i < source.size(); i++) {
                target.add(source.get(i));
            }
        }

        for (int n: target) {
            System.out.print(n + " ");
        }
    }

    public static void reverse (ArrayList<Integer> list) {
        ArrayList<Integer> reverseList = new ArrayList<>();
        for (int i = 0; i<list.size(); i++) {
            reverseList.add(list.get(list.size() - i - 1));
        }

        for ( int n : reverseList) {
            System.out.print(n + " ");
        }
    }

    public static void insertBeginningEnd (LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

}
