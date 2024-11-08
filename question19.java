import java.util.Scanner;
public class question19 {
    public static boolean isPalindrome(int n){
        int reverse=0;
        int temp=n;
        while(n!=0){
            int digits=n%10;
            reverse=(reverse*10)+digits;
            n/=10;
        }
        if(reverse==temp){
            return true;
            }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. which is to be checked for Palindrome");
        int n=sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("Given no. is Palindrome");
        }
        else{
            System.out.println("Given no. is not Palindrome");
        }
    }
}
