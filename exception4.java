public class exception4 {
    public static void main(String[] args) {
        try {
            int data=20/5;
            System.out.println("Value of data is: "+ data);
        } catch (ArithmeticException e) {System.out.println(e);}
        finally{System.out.println("finally block always executed irrespective of the Exception.");}
        System.out.println("rest of the code...");
    }   
}