interface Animal {
    void sound();
}

interface Movement {
    void move();
}

class Dog implements Animal, Movement {
    public void sound() {
        System.out.println("Bark");
    }

    public void move() {
        System.out.println("Dog is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // Output: Bark
        d.move();   // Output: Dog is running
    }
}

/*Output
Bark
Dog is running
*/