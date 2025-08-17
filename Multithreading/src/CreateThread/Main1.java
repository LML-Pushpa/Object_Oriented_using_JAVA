package CreateThread;

public class Main1 {
    public static void main(String[] args) throws InterruptedException{
        TestMain1 t1 =new TestMain1();
        t1.start();

        for(;;){
            System.out.println(Thread.currentThread().getName());
//            Thread.sleep(100);
        }
    }
}
