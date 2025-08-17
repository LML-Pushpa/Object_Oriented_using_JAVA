package ThreadMethods;

public class ClientPrioritySet {
    public static void main(String[] args) {

        PrioritySet l =new PrioritySet("Low");
        PrioritySet m =new PrioritySet("Medium");
        PrioritySet h =new PrioritySet("High");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();
    }
}
