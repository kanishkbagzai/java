//Method hiding in java
class Complex{
    public static void f1(){
        System.out.println("f1 method of Complex class is executed");
    }
}
class Sample extends Complex{
    public static void f2(){
        System.out.println("f2 method of Sample class is executed");
    }
}

public class Assignment2_8 {
    public static void main(String[] args) {
        
    
    Complex d2=new Sample();
    Complex d1=new Complex();
    d1.f1();
    d2.f1();
}
}
