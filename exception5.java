class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
class exception5{
    static void validate(int age) throws InvalidAgeException {
       if (age < 18) {
          throw new InvalidAgeException("not valid");
       } else {
          System.out.println("Welcome to Vote");
       }
    }
 
    public static void main(String[] args) {
       try {
          validate(13);
       } catch (Exception m) {System.out.println("Exception occured:" + m);}
       System.out.println("rest of the code");
    }
 }