import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b && a>c){
            System.out.println("greatest number is "+a);
        }
        else if(b>c && b>a){
            System.out.println("greatest number is "+b);
        }
        else if(c>b && c>a){
            System.out.println("greatest number is "+c);
        }
        else{
            System.out.println("Invalid");
        }
    }
}
