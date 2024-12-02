package JavaClass;

public class StatClass {
    static int sharedCounter = 0; // Static variable

    void increment() {
        sharedCounter++; // Increases the shared counter
    }

    public static void main(String[] args) {
        StatClass obj1 = new StatClass();
        StatClass obj2 = new StatClass();
        StatClass obj3 = new StatClass();

        obj1.increment();
        obj2.increment();
        obj3.increment();


        // Access static variable using the class name
        System.out.println("Shared Counter: " + StatClass.sharedCounter);
    }
}