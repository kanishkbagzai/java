public class MultithreadingRunnableinterface implements Runnable {
    public void run(){
        System.out.println("Thread is running.");
    }
    public static void main(String[] args) {
        MultithreadingRunnableinterface m=new MultithreadingRunnableinterface();
        Thread t1=new Thread(m);
        t1.start();
    }
}
