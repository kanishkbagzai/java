public class Assignment2_5 {
    int a;
    int b;
    int c;
    Assignment2_5(){
        a=0;
        b=0;
        c=0;
    }
    Assignment2_5(int a,int b){
        this.a=a;
        this.b=b;
    }
    Assignment2_5(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static void main(String[] args) {
        Assignment2_5 obj1=new Assignment2_5();
        System.out.println("Default or unparametrized constructor called");
        System.out.println("a="+obj1.a+" "+"b="+obj1.b+" c="+obj1.c);
        System.out.println("Parametrized constructor called with 2 parameters");
        Assignment2_5 obj2=new Assignment2_5(2,3);
        System.out.println("a="+obj2.a+" "+"b="+obj2.b+" c="+obj2.c);
        System.out.println("Parametrized constructor called with 3 parameters");
        Assignment2_5 obj3=new Assignment2_5(2,3,5);
        System.out.println("a="+obj3.a+" "+"b="+obj3.b+" c="+obj3.c);



}
}
