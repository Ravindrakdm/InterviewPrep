package Collection;

import org.w3c.dom.ls.LSOutput;

public class TicketBook {

    int availableTickets = 10;

    public synchronized void booktickets( int tickets){

        if(availableTickets >= tickets){
            availableTickets -= tickets;
            System.out.println("Booked Tickets: "+ tickets+ ", Renamed Tickets: "+availableTickets);
        }else {
            System.out.println("tickets are not available");
        }
    }

    public int getAvailableTickets(){
        return availableTickets;
    }
}
   class Bookings{
       public static void main(String[] args) {

           TicketBook tb = new TicketBook();

           Thread t1 = new Thread(()->
           {
               for (int i = 0; i < 3; i++) {
                   tb.booktickets(3);
                   try {
                       Thread.sleep(50);
                   }catch (InterruptedException e){
                       e.printStackTrace();
                   }
               }
           });

           Thread t2 = new Thread(()->
           {
               for (int i = 0; i < 2; i++) {
                   tb.booktickets(2);
                   try {
                       Thread.sleep(30);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
           });

           t1.start();
           t2.start();

           try {
               t1.join();
               t2.join();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }

           System.out.println("Final remaining tickets: " + tb.getAvailableTickets());
       }
  }