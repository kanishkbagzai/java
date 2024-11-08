import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter percentage for getting the corresponding grade.");
        double per=sc.nextDouble();
        if (per<=100 && per>=90){
            System.out.println("Grade A");


        }
        else if(per<90 && per>=80){
            System.out.println("Grade B");
        }
        else if (per<80 &&per>=70){
        System.out.println("Grade C");
        }
        else if(per<70 &&per>=60){
            System.out.println("Grade D");
        }
        else if(per<60 && per>=40){
            System.out.println("Grade E");

        }
        else if(per >=0 && per<40){
            System.out.println("Grade F");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
