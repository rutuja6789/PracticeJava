package Methods;

public class Java_Methods {
    public static void main(String[] args) {
        int AvgOfNums = AvgNum(2,6);
        System.out.println(AvgOfNums+10);
    }
    public static int AvgNum(int a, int b){
        int avg = (a+b)/2;
        System.out.println("Average of 2 numbers is = "+ avg);
        return avg;
    }
}
