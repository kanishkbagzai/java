import java.util.Scanner;
public class question12 {
    public static boolean isEligible(int maths, int physics, int chemistry) {
        int totalAll = maths + physics + chemistry;
        int totalMP = maths + physics;
        return (maths >= 60 && physics >= 50 && chemistry >= 40 &&
                (totalAll >= 200 || totalMP >= 150));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in physics :");
        int p=sc.nextInt();
        System.out.println("Enter marks in chemistry :");
        int c=sc.nextInt();
        System.out.println("Enter marks in mathematics :");
        int m=sc.nextInt();
        if(isEligible(m, p, c)){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
}
}
