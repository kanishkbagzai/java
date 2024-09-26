// Interface 1
interface Interface1 {
    void method1A();
    void method1B();
}

// Interface 2
interface Interface2 {
    void method2A();
    void method2B();
}

// Interface 3
interface Interface3 {
    void method3A();
    void method3B();
}

// New interface inheriting from Interface1, Interface2, and Interface3
interface NewInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}

// Concrete class
class ConcreteClass {
    public void concreteMethod() {
        System.out.println("This is a method from ConcreteClass.");
    }
}

// Class implementing NewInterface and inheriting ConcreteClass
class MyClass extends ConcreteClass implements NewInterface {

    // Implementing methods from Interface1
    public void method1A() {
        System.out.println("Method1A from Interface1.");
    }

    public void method1B() {
        System.out.println("Method1B from Interface1.");
    }

    // Implementing methods from Interface2
    public void method2A() {
        System.out.println("Method2A from Interface2.");
    }

    public void method2B() {
        System.out.println("Method2B from Interface2.");
    }

    // Implementing methods from Interface3
    public void method3A() {
        System.out.println("Method3A from Interface3.");
    }

    public void method3B() {
        System.out.println("Method3B from Interface3.");
    }

    // Implementing the new method in NewInterface
    public void newMethod() {
        System.out.println("NewMethod from NewInterface.");
    }
}

// Methods accepting interfaces as arguments
class InterfaceMethods {

    public static void methodForInterface1(Interface1 i1) {
        i1.method1A();
        i1.method1B();
    }

    public static void methodForInterface2(Interface2 i2) {
        i2.method2A();
        i2.method2B();
    }

    public static void methodForInterface3(Interface3 i3) {
        i3.method3A();
        i3.method3B();
    }

    public static void methodForNewInterface(NewInterface ni) {
        ni.newMethod();
    }
}

// Main class to demonstrate the program
public class Assignment2_17 {
    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass obj = new MyClass();

        // Call the concrete method from ConcreteClass
        obj.concreteMethod();
        
        // Pass the object to methods for different interfaces
        InterfaceMethods.methodForInterface1(obj);
        InterfaceMethods.methodForInterface2(obj);
        InterfaceMethods.methodForInterface3(obj);
        InterfaceMethods.methodForNewInterface(obj);
    }
}


    

