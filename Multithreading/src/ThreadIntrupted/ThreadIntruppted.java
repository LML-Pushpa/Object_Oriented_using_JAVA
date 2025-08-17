package ThreadIntrupted;

public class ThreadIntruppted extends Thread{
    public ThreadIntruppted(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + "is Running");
//            Thread.yield();//give chance to another thread Compare both results
        }
    }

}

