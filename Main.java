public class Main {
    public static void main(String[] args) {
        NumbGenerator genre = new NumbGenerator();
        try{
            while(genre.getThread().isAlive()){
                System.out.println("Main thread undead till its child die!");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted!");
        }
        System.out.println("Main thread is over!");
    }
}
