import java.util.*;
class TooOlderException extends Exception{

    public String toString(){
        return "TooOld";
    }

    public String getMessage(){
        return "age is too old";
    }  
}
class TooYoungerException extends Exception{

    public String toString(){
        return "TooYoung";
    }

    public String getMessage(){
        return "age is too young";
    }
}
public class Assignment2_24 {
    public static void main(String args[]){
        String name;
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.next();
        System.out.println("Enter Age");
        age=sc.nextInt();
        try{
            if(age>45){
                throw new TooOlderException();
            }
            else if(age<20){
                throw new TooYoungerException();
            }else{
                System.out.println("Eligible..");
                System.out.println("name of the candidate is: " + name);
            }
        }catch(Exception e){
            System.out.println("exception caught: " + e.getMessage());
        }
    }
}
// OUTPUT
// Kavya
// Enter Age
// 74
// exception caught: age is too old