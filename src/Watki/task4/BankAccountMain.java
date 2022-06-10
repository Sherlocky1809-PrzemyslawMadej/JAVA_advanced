package Watki.task4;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(10000);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bankAccount.pay(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                bankAccount.transfer(5000);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                bankAccount.transfer(7000);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
