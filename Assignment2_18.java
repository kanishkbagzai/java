interface InterfaceA{
    void methodA1();
    void methodA2();
}
interface InterfaceB{
    void methodB1();
    void methodB2();
}
interface InterfaceC{
    void methodC1();
    void methodC2();
}
interface CombinedInterface extends InterfaceA,InterfaceB,InterfaceC{
    void methodD();
}
// Define a concrete class
class ConcreteClass {
    public void concreteClassMethod() {
        System.out.println("ConcreteClass method");
    }
}

// Define MyClass that implements CombinedInterface and extends ConcreteClass
class MyClass extends ConcreteClass implements CombinedInterface {

    
    public void methodA1() {
        System.out.println("Implementing methodA1 from InterfaceA");
    }

   
    public void methodA2() {
        System.out.println("Implementing methodA2 from InterfaceA");
    }

 
    public void methodB1() {
        System.out.println("Implementing methodB1 from InterfaceB");
    }

   
    public void methodB2() {
        System.out.println("Implementing methodB2 from InterfaceB");
    }


    public void methodC1() {
        System.out.println("Implementing methodC1 from InterfaceC");
    }


    public void methodC2() {
        System.out.println("Implementing methodC2 from InterfaceC");
    }


    public void methodD() {
        System.out.println("Implementing methodD from CombinedInterface");
    }
}

// Define four methods that accept each of the interfaces as parameters
public class Assignment2_18 {

    public static void useInterfaceA(InterfaceA a) {
        a.methodA1();
        a.methodA2();
    }

    public static void useInterfaceB(InterfaceB b) {
        b.methodB1();
        b.methodB2();
    }

    public static void useInterfaceC(InterfaceC c) {
        c.methodC1();
        c.methodC2();
    }

    public static void useCombinedInterface(CombinedInterface d) {
        d.methodD();
    }

    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass myObject = new MyClass();

        // Call methods on myObject using each interface type
        System.out.println("Calling useInterfaceA:");
        useInterfaceA(myObject);

        System.out.println("\nCalling useInterfaceB:");
        useInterfaceB(myObject);

        System.out.println("\nCalling useInterfaceC:");
        useInterfaceC(myObject);

        System.out.println("\nCalling useCombinedInterface:");
        useCombinedInterface(myObject);

        // Calling method from the inherited concrete class
        System.out.println("\nCalling concreteClassMethod:");
        myObject.concreteClassMethod();
    }
}


    

