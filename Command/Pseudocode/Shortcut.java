package Command.Pseudocode;

import java.util.HashMap;
import java.util.Map;

public class Shortcut {
    private Map<String, Action> s = new HashMap<>();

    public void onKeyPress(String shortcut, Action action) {
        s.put(shortcut, action);
    }

    public void onPress(String shortcut) {
        if (s.containsKey(shortcut)) {
            s.get(shortcut).perform();
        }
    }
}
