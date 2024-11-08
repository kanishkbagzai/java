import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. whose divisibility is to be checked");
        int a=sc.nextInt();
        System.out.println("enter the no. through which the above entered number's divisibility will be checked.");
        int b=sc.nextInt();
        if(a%b==0){
            System.out.println("a is divisible by b");

        }
        else {
            System.out.println("a is not divisible by b");
        }

    }
}
