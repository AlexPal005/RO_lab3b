public class Client implements Runnable {
    private Work work;
    public Client(Work work){
        this.work = work;
    }
    @Override
    public void run() {
        while(true){
            try {
                work.put();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
