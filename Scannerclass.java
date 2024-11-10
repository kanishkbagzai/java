import java.util.Scanner;
public class Scannerclass {


    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter a integer value");
        int x=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        System.out.println("enter a string ");
        String s1=sc2.next();
        Scanner sc3=new Scanner(System.in);
        System.out.println("enter a float value");
        float f1=sc3.nextFloat();
        Scanner sc4=new Scanner(System.in);
        System.out.println("enter a boolean value");
        boolean b1 =sc4.hasNextInt();
        Scanner sc5=new Scanner(System.in);
        System.out.println("enter a string line ");
        String s2= sc5.nextLine();

        
        System.out.println(x);
        System.out.println(s1);
        System.out.println(f1);
        System.out.println(b1);
        System.out.println(s2);
    }
}

