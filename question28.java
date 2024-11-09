import java.util.Scanner;

public class question28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        Scanner sc1=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("enter array element");
            a[i]=sc1.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]%2!=0 && a[i]!=0){
                sum+=a[i];
            }
        }    
        System.out.println("sum of odd elements in array is "+sum);
    }
}
