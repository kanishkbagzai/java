class Cars{
    String number;
    String color;
    public Cars(){
        color="White";
        number="MP 09 AB 0001";
    }
    public void display(){
        System.out.println("car number = "+number);
        System.out.println("car color = "+color);
    }
}
public class question31 {
    public static void main(String[] args) {
        Cars c=new Cars();// constructor with 0 arguements is called.
        c.display();
    }

}
