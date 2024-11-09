import java.util.Scanner;
public class question27 {
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
        //smallest in an array
        int min=a[0];
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("smallest element in array is "+min);
    }
}
