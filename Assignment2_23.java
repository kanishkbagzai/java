import java.util.Scanner;
class TooHotException extends Exception{

    public String toString(){
        return "TooHot";
    }

    public String getMessage(){
        return "temperature is too hot";
    }
}
class TooColdException extends Exception{

    public String toString(){
        return "TooCold";
    }

    public String getMessage(){
        return "Temperature is too cold";
    }
}
public class Assignment2_23 {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       float temp=sc.nextFloat();
       try{
       if(temp>35){
            throw new TooHotException();
       }
       else if(temp<5){
        throw new TooColdException();
       }
       else{
          System.out.println("Normal");
          System.out.println("the temperature in farenheit is: " + (temp*(9/5))+32);
       }
    }catch(Exception e){
        System.out.println("caught exception: " + e.getMessage());
    }
    }
}