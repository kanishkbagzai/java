import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers for swapping");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);
        int temp;
        temp=b;
        b=a;
        a=temp;
        System.out.println("After Swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

}
