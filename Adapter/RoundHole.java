package Adapter;

public class RoundHole {
    private int radius;

    public RoundHole(int radius){
        this.radius = radius;
    }

    public int getRadius () {
        return this.radius;
    }

    public boolean fit ( RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
