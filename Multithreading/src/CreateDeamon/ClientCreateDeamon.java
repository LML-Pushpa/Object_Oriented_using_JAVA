package CreateDeamon;

public class ClientCreateDeamon {
    public static void main(String[] args) {
        CreateDeamon c =new CreateDeamon();
        c.setDaemon(true);
        c.start();
        System.out.println("Main Done");
    }
}
