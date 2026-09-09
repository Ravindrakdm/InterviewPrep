package Collection;

public class CounterSynch {
    private int count = 0;

    public void Increase() {
        synchronized (this){count++;}
    }

    public int get() { return count; }
}
    class M1 {
        public static void main(String[] args) throws InterruptedException {

            CounterSynch cs = new CounterSynch();

            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    cs.Increase();
                }
                ;
            });

            Thread t2 = new Thread(()->{
                for (int i=0; i<1000; i++){
                    cs.Increase();
                }
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();

            System.out.println(cs.get());
        }
    }
