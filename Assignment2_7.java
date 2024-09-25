// Write a Java program to show method overriding.
class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }

}
class Bike extends Vehicle{
    void run(){
        System.out.println("Bike is running");
    }
}
class Car extends Vehicle{
    void run(){
        System.out.println("Car is running");
    }
}
public class Assignment2_7 {
    public static void main(String[] args) {
        Bike b=new Bike();
        b.run();
        Car c=new Car();
        c.run();
    }
}
