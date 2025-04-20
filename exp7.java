class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        intBox.display();  // Output: Value: 100

        Box<String> strBox = new Box<>("Hello, Generics");
        strBox.display();  // Output: Value: Hello, Generics
    }
}

/*Output
Value: 100
Value: Hello, Generics
*/
