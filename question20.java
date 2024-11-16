import java.util.Scanner;
     public class question20{
    public static boolean isPrime(int number) {
       for(int i=2;i<number;i++){
        if(number%i==0){
            return false;
        }
    }
     return true;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is a composite number.");
        }
    }
}