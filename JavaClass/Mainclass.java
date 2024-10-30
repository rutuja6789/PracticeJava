package JavaClass;

public class Mainclass {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "Mandy";

        d2.walk();
        d1.walk();

    }
}
    class Dog {
        String name;
        int age;
        String color;

        void bark() {
            System.out.println(name + " is barking");
        }

        void walk() {
            System.out.println(name + " is walking");
        }
    }