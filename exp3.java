class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is moving");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.move();  // Output: Vehicle is moving

        Car c = new Car();
        c.move();  // Output: Car is moving
    }
}

/*Output
Vehicle is moving
Car is moving
*/