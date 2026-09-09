package Collection;

public class Counter{
     private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    public void start() {
        new Thread(() ->
        {
            while (running) {
                System.out.println("Running");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
        }
                System.out.println("Stopped");
    }
         ).start();
}
}
class count{
    public static void main(String[] args) throws InterruptedException {
        Counter count =new Counter();
        count.start();

        Thread.sleep(600);
        count.stop();
    }
}