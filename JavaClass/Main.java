package JavaClass;

interface Animal {
    void sound();
    void eat();
}

class Dog1 implements Animal {
    @Override
    public void sound() {
        System.out.println("Dogs says : Woof Woof");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat1 implements Animal {

    @Override
    public void sound() {
        System.out.println("Cat says : Meow");
    }

    @Override
    public void eat() {
        System.out.println("cat is eating");
    }
}

class Bird implements Animal {
    @Override
    public void sound() {
        System.out.println("Bird are Chirping");
    }

    public void eat() {
        System.out.println("Birds are eating");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog1();
        Animal cat = new Cat1();
        Animal bird = new Bird();

        animalAction(dog);
//        animalAction(cat);
        animalAction(bird);
    }

    static void animalAction(Animal animal) {
        animal.sound();
        animal.eat();
    }
}