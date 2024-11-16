import java.util.Scanner;
class Commission{
    public int sales;
     Commission(){ 
    }
     public int commission(int y){
        this.sales = y;
        return y/20;
    }
}
public class CommissionDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Commission c1 = new Commission();
        System.out.print("enter the sales:");
        int a = sc.nextInt();
        if(a > 0){
            System.out.print("Commission is :");
            System.out.println(c1.commission(a)+" INR");
        }else{
            System.out.println("Invalid input. ");
        }
   }
}


//SAMPLE OUTPUT
// enter the sales:200
// Commission is :10 INR
