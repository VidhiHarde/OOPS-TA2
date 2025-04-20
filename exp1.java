class Student {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 20;
        
        System.out.println("Student Name: " + student1.name);
        System.out.println("Student Age: " + student1.age);
    }
}

/*Output
Student Name: John
Student Age: 20
*/
