public class exception3 {
    public static void main(String[] args) {
       try {
          try {
             System.out.println("going to divide");
             int b = 39 / 0;
          } catch (ArithmeticException e) {System.out.println(e);}
          try {
             int[] a= new int[5];
             a[5] = 4;
          } catch (ArrayIndexOutOfBoundsException e) {System.out.println(e);}
          System.out.println("other statement");
       } catch (Exception e) {System.out.println("handled");}
        System.out.println("normal flow...");
    }
 }
// OUTPUT->
// going to divide
// java.lang.ArithmeticException: / by zero
// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
// other statement
// normal flow...