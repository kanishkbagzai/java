// Write a Java program to show parameterized constructor.
public class Assignment2_3 {
    int a;
    public
    Assignment2_3(int x){
        System.out.println("Parametrized constructor called");
        a=x;
    }
    public static void main(String[] args) {
        Assignment2_3 obj=new Assignment2_3(3);
        System.out.println(obj.a);
    }
}
