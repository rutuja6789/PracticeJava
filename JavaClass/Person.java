package JavaClass;

public class Person {

//    name, username, age
    String name;
    String username;
    private int age;

    public Person(String name){
        this.name=name;
    }

    public Person(String nm, int age){
        name = nm;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
