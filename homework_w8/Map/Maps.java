package Map;

import java.util.*;

public class Maps {
    public static int count (Map<Integer, String> map) {
        return map.size();
    }

    public static void empty (Map<Integer, String> map) {
        map.clear();
    }

    public static boolean contains (Map<Integer, String> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue (Map<Integer, String> map, int key, String value) {
        return (map.containsKey(key) && map.get(key) == value );
    }

    public static Set<Integer> keySet (Map<Integer, String> map) {
        return map.keySet();
    }

    public static Collection<String> values (Map<Integer, String> map) {
        return map.values();
    }

    public static String getColor (int value) {
        switch (value) {
            case 0:
                System.out.println("black");
                break;
            case 1:
                System.out.println("white");
                break;
            case 2:
                System.out.println("red");
                break;
        }
        return null;
    }




}
