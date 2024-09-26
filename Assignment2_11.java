class Num{
    int n;
    public Num(int n){
        this.n=n;
    }
    public void showNum(){
        System.out.println("Number: "+n);
    }
}
class HexNum extends Num{
    public HexNum(int n){
        super(n);

    }
    public  void showNum(){
        System.out.println("Hexadecimal:"+Integer.toHexString(n).toUpperCase());
        System.out.println("Octal:"+Integer.toOctalString(n));

    }
}
public class Assignment2_11 {
    public static void main(String[] args) {


                // Create an object of Num
                Num numObj = new Num(255);
                System.out.println("Base class output:");
                numObj.showNum();  // Call the showNum method of the base class
        
                // Create an object of HexNum
                HexNum hexNumObj = new HexNum(255);
                System.out.println("\nDerived class output:");
                hexNumObj.showNum();  // Call the overridden showNum method of the derived class


}
}