// Write a Java program to explain “multilevel inheritance.”
class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
class babydog extends Dog{
    void weep(){
        System.out.println("Weeping");
    }
}
public class Assignment2_13 {
    public static void main(String[] args) {
        babydog dog=new babydog();
        dog.weep();
        dog.bark();
        dog.eat();
    }
}
