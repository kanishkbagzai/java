public class exception1 {

        public static void main(String[] args) {
            int data=50/0; //may throw exception
            System.out.println("rest of the code....");
        }
    }
// output->Exception in thread "main" java.lang.ArithmeticException: / by zero
