import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if(isleapyear(year)){
            System.out.println(year+" is leap year.");
        }
        else{
            System.out.println(year+" is not as leap year.");
        }
    }
    public static boolean isleapyear(int year){
        if(year%400==0){
            return true;
    
        }
        if(year%100==0){
            return false;
        }
        if(year%4==0){
            return true;
        }
        else{
            return false;
        }
    }
}
