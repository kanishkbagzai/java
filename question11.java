import java.util.Scanner;
public class question11 {
    public static int reversenumber(int n){
        int reverse=0;
        while(n!=0){
        
        int digit=n%10;
        reverse=(reverse*10)+digit;
        n/=10;
    }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the no. whose reverse is to be displayed");
        int n=sc.nextInt();
        System.out.println("Reverse of the given no. is "+reversenumber(n));
    }
}
