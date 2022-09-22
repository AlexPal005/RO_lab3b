public class Barber implements Runnable {
    private Work work;
    public Barber(Work work){
        this.work = work;
    }
    @Override
    public void run() {
        while(true){
            try {
                work.get();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
