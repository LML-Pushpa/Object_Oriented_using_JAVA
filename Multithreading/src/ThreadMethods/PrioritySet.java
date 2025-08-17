package ThreadMethods;

public class PrioritySet extends Thread{
    public PrioritySet(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+"Priority : "+Thread.currentThread().getPriority()+" "+"Count "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
