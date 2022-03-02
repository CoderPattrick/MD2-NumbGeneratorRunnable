public class NumbGenerator implements Runnable{
    private Thread thread;

    public Thread getThread() {
        return thread;
    }

    public NumbGenerator() {
        thread = new Thread(this);
        System.out.println("Thread created!");
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <11 ; i++) {
                System.out.print(i+": ");
                System.out.println(this.hashCode());
                thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread child interrupted!");
        }
        System.out.println("Thread child is done!");
    }
}
