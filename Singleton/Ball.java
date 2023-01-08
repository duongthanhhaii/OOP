package Singleton;

import java.util.HashMap;

public class Ball {
    private String color;
    private static HashMap<String, Ball> balls = new HashMap<>();

    private Ball (String color) {
        this.color = color;
    }

    public static Ball getInstance(String color) {
        if (!balls.containsKey(color)) {
            balls.put(color, new Ball(color));
        }
        return balls.get(color);
    }

    public String getColor(){
        return color;
    }

}
