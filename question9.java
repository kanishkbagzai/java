
public class question9 {
    public static long CalculatFactorial(int n){
        long result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 12 is : "+CalculatFactorial(12));
    }    
}
