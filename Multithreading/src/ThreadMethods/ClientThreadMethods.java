package ThreadMethods;

public class ClientThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t1 =new ThreadMethods();
        System.out.println(Thread.currentThread().getName());
        t1.start();
        System.out.println(t1.getState());
        t1.join();
        System.out.println(Thread.currentThread().getName());

    }
}
