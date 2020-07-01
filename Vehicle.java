public class Vehicle {
    
    private int id = 0;
    private String name;
    static int maxID = 1;

    Vehicle() {

        id = maxID++;
        
    }

    public int getId() {
        return id;
    }

    public Vehicle(String name) {

        this.name = name;
        id = maxID++;

    }
}