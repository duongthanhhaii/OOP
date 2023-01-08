package Set;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(3);
        set2.add(1);
        set2.add(6);
        set2.add(10);

        ///
        Set<Integer> intersectionManual = Sets.intersectionManual(set1, set2);
        for (int n : intersectionManual) {
            System.out.print(n + " ");
        }
        System.out.println();
        Set<Integer> intersection = Sets.intersection(set1, set2);
        for (int n : intersection) {
            System.out.print(n + " ");
        }
        System.out.println();

        ///
        Set<Integer> union = Sets.union(set1, set2);
        for (int n : union) {
            System.out.print(n + " ");
        }
        System.out.println();
        Set<Integer> unionManual = Sets.unionManual(set1, set2);
        for (int n : unionManual) {
            System.out.print(n + " ");
        }
        System.out.println();

    /////
        List<Integer> set3 = new ArrayList<>();
        set3.add(1);
        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3 = Sets.removeDuplicateManual(set3);
        for (int n : set3) {
            System.out.print(n + " ");
        }
        System.out.println();

        /////
        String set4 = new String("Helloo");
        System.out.println(Sets.firstRecurringCharacter(set4));
        System.out.println(Sets.allRecurringChars(set4));

        ///
        TreeSet<Integer> set5 = new TreeSet<>();
        set5.add(1);
        set5.add(1);
        set5.add(2);
        set5.add(3);
        System.out.println(Sets.getFirst(set5));
        System.out.println(Sets.getLast(set5));

    }
}
