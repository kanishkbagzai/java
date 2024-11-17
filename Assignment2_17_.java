import java.util.*;
public class Assignment2_17_ {
    private static int sum_of_consecutive(String number) {
        int sum = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            int consecutiveNumber = (number.charAt(i) - '0') * 10 + (number.charAt(i + 1) -'0' );
            sum += consecutiveNumber;
        }
        return sum;
    }
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String n=sc.next();
    int ans=sum_of_consecutive(n);
    System.out.println("the sum is: "+ ans);
 }
}