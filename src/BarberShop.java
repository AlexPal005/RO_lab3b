
public class BarberShop{
    private int count = 0;
    public static void main (String args[]){
        new BarberShop().go();
    }
    public void go(){
        Work work = new Work();
        Barber barber = new Barber(work);
        Client client = new Client(work);
        new Thread(barber).start();
        for(int i = 0 ; i < 3 ; i++) {
            new Thread(client).start();
        }
    }
}