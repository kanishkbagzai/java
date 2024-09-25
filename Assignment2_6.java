// Write a Java program to show method overloading.

public class Assignment2_6 {
    int a;
    int b;
    int c;
    void setvalues(){
        a=0;
        b=0;
        c=0;
    }
    void setvalues(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    void setvalues(int a,int b){
        this.a=a;
        this.b=b;
    }
public static void main(String[] args) {
    Assignment2_6 obj=new Assignment2_6();
    obj.setvalues();
    System.out.println("a="+obj.a+" b="+obj.b+" c="+obj.c);
    obj.setvalues(2, 4);
    System.out.println("a="+obj.a+" b="+obj.b+" c="+obj.c);
    obj.setvalues(4, 06, 07);
    System.out.println("a="+obj.a+" b="+obj.b+" c="+obj.c);
}
}