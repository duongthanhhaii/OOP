package List;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> source = new ArrayList<>();
        source.add(0);
        source.add(5);
        source.add(2);
        source.add(7);
        ArrayList<Integer> target = new ArrayList<>();
        Lists.copy(source, target);
        System.out.println();
        Lists.reverse(source);
        System.out.println();

        ArrayList<Integer> square = Lists.generateSquare();
        for (int num : square) {
            System.out.print(num + " ");
        }
        System.out.println();

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(2);
        Lists.insertBeginningEnd(linkedList, 2);
        for (int n:linkedList) {
            System.out.print(n + " ");
        }

    }
}
