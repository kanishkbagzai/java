    public class exception2 {
        public static void main(String[] args) {
            try {
                int data=500/0;
            } catch (ArithmeticException e) {System.out.println(e);}
            System.out.println("rest of the code...");
        }
    }
    
// OUTPUT->
//java.lang.ArithmeticException: / by zero
//rest of the code...
