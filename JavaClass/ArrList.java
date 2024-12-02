package JavaClass;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
    List<String> shoeRack =  Arrays.asList("rutuja", "Pradumnya", "zendphale");
//        System.out.println(shoeRack);

        shoeRack.forEach(shoe -> System.out.println(shoeRack));

//    Mobile obj1=new Mobile("Sam",1);
//        Mobile obj2=new Mobile("Ihn",2);
//        List<Mobile>list4=new ArrayList<>();
//        list4.add(obj1);
//        list4.add(obj2);
//
//        list4.forEach(a-> System.out.println(a.getModel()));
//        shoeRack.add("Adidas");
//        System.out.println(shoeRack);
//    shoeRack.add(0, "Nike");
//    shoeRack.add("New Balance");
//    shoeRack.add(1,"Puma");
//        System.out.println(shoeRack);
//        System.out.println(shoeRack.set(1,"Samba"));
//        System.out.println(shoeRack.remove(1));
//        System.out.println(shoeRack.size());
//        System.out.println(shoeRack.get(2));

//        for(int i = 0; i< shoeRack.size(); i++){
//            System.out.println(shoeRack.get(i));
//        }
//        for(String i : shoeRack ){
//            System.out.println(i);
//        }
//            shoeRack.forEach(a-> System.out.println(a));
    }
}
