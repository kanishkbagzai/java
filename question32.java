class Cars{
    String number;
    String color;
    public Cars(String color,String number){//parametrized constructor
        this.color=color;
        this.number=number;
    }
    public void display(){
        System.out.println("car number = "+number);
        System.out.println("car color = "+color);
    }
}
public class question32 {
    public static void main(String[] args) {
        Cars c=new Cars("Black","MP 09 AB 0001");// constructor with  arguements is called (parametrized constructor).
        c.display();
    }

}
