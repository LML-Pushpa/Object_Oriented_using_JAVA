package ThreadIntrupted;

public class ClientThreadIntrupted {
    public static void main(String[] args) {
        ThreadIntruppted t1 =new ThreadIntruppted("t1");
        ThreadIntruppted t2 =new ThreadIntruppted("t2");
        t1.start();
        t2.start();

    }
}
