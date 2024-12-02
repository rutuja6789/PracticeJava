package JavaClass;

public class Mobile {
    String brand;
    private int modelNo;

    public Mobile(){

    }
    public Mobile(String brand, int modelNo){
        this.brand = brand;
        this.modelNo = modelNo;
    }
    public Mobile(int modelNo) {
        this.modelNo = modelNo;
    }

    public void setModelNo(int modelNo){
        this.modelNo = modelNo;
    }

    public void setBrand(String name){
        this.brand = name;
    }

    public int getModel(){
        return modelNo;
    }


}
