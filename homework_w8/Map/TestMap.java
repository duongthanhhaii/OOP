package Map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "duong");
        map1.put(3, "thanh");
        map1.put(4, "hai");
        System.out.println(Maps.count(map1));
        Maps.getColor(1);
    }
}
