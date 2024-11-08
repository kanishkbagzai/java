import java.util.Scanner;
public class question13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the lower limit of range");
        int s=sc.nextInt();
        System.out.println("Enter the upper limit of range");
        int e=sc.nextInt();
        int sum=0;
        if(s<=e){
            for(int i=s;i<=e;i++){
                sum+=i;
            }
        }
        else{
            System.out.println("Invalid Range");
        }
        System.out.println("sum of natural numbers in the given range is "+sum);
    }
        




}
