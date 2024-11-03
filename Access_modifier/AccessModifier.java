package Access_modifier;

class Emp{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getid(){
        return id;
    }

}
public class AccessModifier {
    public static void main(String[] args) {
        Emp IT_dept = new Emp();
        IT_dept.setId(12);
        IT_dept.setName("Rutuja");
        System.out.println(IT_dept.getName());
        System.out.println(IT_dept.getid());
    }
}
