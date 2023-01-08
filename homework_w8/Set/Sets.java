package Set;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual (Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
            for ( int i : first) {
                for ( int j : second) {
                    if (i == j) {
                        intersection.add(i);
                    }
            }
        }
        return intersection;
    }

    public static Set<Integer> intersection ( Set<Integer> first, Set<Integer> second) {
       first.retainAll(second);
       return first;
    }

    public static Set<Integer> unionManual (Set<Integer> first, Set<Integer> second) {
        for (int i : first) {
            for (int j : second) {
                if (i != j) {
                    first.add(j);
                }
            }
        }
        return first;
    }

    public static Set<Integer> union (Set<Integer> first, Set<Integer> second) {
        first.addAll(second);
        return first;
    }

    public static List<Integer> toList (Set<Integer> source) {
        List<Integer> list = new ArrayList<>();
        list.addAll(source);
        return list;
    }

    public static List<Integer> removeDuplicateManual (List<Integer> source) {
        List<Integer> result = new ArrayList<>();
        for ( int n: source) {
            if ( !result.contains(n) ) {
                result.add(n);
            }
        }
        return result;
    }

    public static char firstRecurringCharacter(String s) {
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (result.contains(ch)) {
                return ch;
            } else {
                result.add(ch);
            }
        }
        return 0;
    }

    public static Set<Character> allRecurringChars (String s) {
        Set<Character> result = new HashSet<>();
        for (int i=0; i<s.length() - 1; i++) {
            char ch1 = s.charAt(i);
            for ( int j=i+1; j<s.length(); j++) {
                char ch2 = s.charAt(j);
                if (ch1 == ch2) {
                    result.add(ch1);
                }
            }
        }
        return result;
    }

    public static int getFirst (TreeSet<Integer> source) {
        int first = source.first();
        return first;
    }

    public static int getLast (TreeSet<Integer> source) {
        int last = source.last();
        return last;
    }

    public static int getGreater (TreeSet<Integer> source, int value) {
        int result = source.higher(value);
        return result;
    }




}
