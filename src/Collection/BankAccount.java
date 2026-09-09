package Collection;

public class BankAccount {

    private int balance = 1000;
    public synchronized void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: "+ amount + " , Balance: "+ balance );
    }

    public synchronized void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("withdraw: "+ amount +", balance:  "+ balance);
        }else {
            System.out.println("insufficient balnce to withrow: "+amount);
        }
    }
    public int getBalance(){     return balance;    }

    public static void main(String[] args) {
         BankAccount ba = new BankAccount();

         Thread t1= new Thread(()->
         {
             for (int i = 0; i < 3; i++) {
                 ba.deposit(1000);
             }
             try {
                 Thread.sleep(50);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         });
        Thread t2 = new Thread(()->
        {
            for (int i = 0; i < 3; i++) {
                ba.withdraw(500);
            try {
               Thread.sleep(50);
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

        System.out.println("Final Balance: " + ba.getBalance());
    }
}
