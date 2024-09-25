// Write a Java program to implement the concept of inheritance.
class Animal{
    void Eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("Barking");
    }
}

public class Assignment2_4{
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.Eat();
        obj.Bark();
    }
}
