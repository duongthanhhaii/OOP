package Observer.Pseudocode;

import java.util.HashMap;
import java.util.List;

public class EventManager {
    private HashMap<String, List<EventListeners>> listeners = new HashMap<>();

    public void subscribe(String eventType, EventListeners newListener) {
        List<EventListeners> user = listeners.get(eventType);
        user.add(newListener);
    }

    public void unsubscribe (String eventType, EventListeners removeListener) {
        listeners.remove(eventType, removeListener);
    }

    public void notify (String eventType, String data) {
        List<EventListeners> users = listeners.get(eventType);
        for (EventListeners listener : users) {
            listener.update(data);

        }
    }


}
