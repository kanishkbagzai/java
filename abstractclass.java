abstract class bike{
    abstract void run();
}
class honda extends bike{
    void run(){
        System.out.println("running safely...");
    }
}
public class abstractclass{
public static void main(String[]args){
   bike h1= new honda();
   h1.run();
}
}
// OUTPUT
// running safely...