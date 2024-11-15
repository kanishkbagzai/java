import java.util.*;
class NegativeAgeException extends Exception{

    public String toString(){
        return "NegativeAge";
    }

    public String getMessage(){
        return "age can not be negative";
    }  
}
public class Assignment2_26 {
    public static void main(String [] args){
        String name;
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter age");
        age=sc.nextInt();
        try{
            if(age<0){
                throw new NegativeAgeException();
            }
            else{
                System.out.println("name is: " + name);
                System.out.println("age is: " + age);
            }
        }catch(Exception e){
            System.out.println("exception caught: " + e.getMessage());
        }
    }
}