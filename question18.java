import java.util.Scanner;
public class question18 {
    public static int countdigits(int n){
        int count=0;
        while(n!=0){
            count+=1;
            n/=10;
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the ineteger whose no. of digits is to be determined:");
        int n=sc.nextInt();
        System.out.println("NO. of digits is "+countdigits(n));
    }

}
