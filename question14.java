import java.util.Scanner;
public class question14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the lower limit of range");
        int s=sc.nextInt();
        System.out.println("Enter the upper limit of range");
        int e=sc.nextInt();
        System.out.println("Multiples of 10 in the given range:");
        if(s<=e && s>=10){
            for(int i=s;i<=e;i++){
                if(i%10==0){
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("Invalid Range by user");
        }
    }
}
