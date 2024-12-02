package JavaClass;

public class Mainclass {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.setName("rutu");
//        d1.printWalk();



        Dog d8=new Dog("RED");
        // int age= another service.getAge("rutu");


        d8.setName("Rutu");
        System.out.println(d8.toString1());


    }
}
    class Dog {
        String name;
        static int age;
        private String color;

//        -----------------------------------------------------------------
        private Dog(String name,String clr){
            this.name=name;
            this.color=clr;

        }
        public Dog (){

        }

        public Dog(String color){
            this.color=color;
        }
//-------------------------------------------------------------------------------=
        public void setName(String name) {
            this.name = name;
        }

        void printBark() {

            System.out.println(name + " is barking");
        }

        String  printColor() {
            return color;
//            System.out.println(color +" is ,my color");
        }

        static int  returnStatic() {
            return  age;

        }

        void printWalk() {
            System.out.println(name + " is walking");
        }


        public String toString1() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }