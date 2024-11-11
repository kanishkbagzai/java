public class MultithreadingThreadclass extends Thread{
    public void run(){
        System.out.println("Thread is running.");
    }
    public static void main(String[] args) {
        MultithreadingThreadclass t1=new MultithreadingThreadclass();
        t1.start();
    }

}