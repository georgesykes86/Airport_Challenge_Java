import java.util.ArrayList;

public class Airport {

    ArrayList<Plane> planes;
    public int capacity;
    public static final int CAPACITY = 5;

    public Airport(int capacity) {
        this.planes = new ArrayList<Plane>();
        this.capacity = capacity;
    }
    public Airport() {
        this.planes = new ArrayList<Plane>();
        this.capacity = CAPACITY;
    }



}