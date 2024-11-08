import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to perform Celsius to Fahrenheit operation and 2 for vice versa.");
        int choice=sc.nextInt();
        if(choice==1){
            Scanner sc1=new Scanner(System.in);
            System.out.print("Enter temperature in celsius:");
            double c=sc1.nextDouble();
            double f=(c*9/5 + 32) ;
            System.out.println("Temperature in Fahrenheit is: "+f+"℉");
        }
        else if(choice==2){
            Scanner sc2=new Scanner(System.in);
            System.out.println("Enter temperature in fahrenheit:");
            double f=sc2.nextDouble();
            double c=(f-32)*5/9;
            System.out.println("Temperature in celcius is: "+c+"℃");
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
