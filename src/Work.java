public class Work {
    private int job = 0;
    public synchronized void get() {
        while (job == 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                break;
            }
        }
        job--;
        System.out.println(Thread.currentThread().getName() + " Cutting... " + job);
        notify();
    }
    public synchronized void put() {
        while (job != 0 ) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                break;
            }
        }
        System.out.println(Thread.currentThread().getName() + " The client has arrived...");
        job = 5;
        Thread.currentThread().interrupt();
        notify();
    }
}
