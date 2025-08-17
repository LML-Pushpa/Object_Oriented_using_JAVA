package ThreadMethods;

public class ThreadMethods extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<=5;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
