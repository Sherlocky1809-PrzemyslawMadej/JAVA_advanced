package Watki.task4;

public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized void transfer(float amount) {
        balance += amount;
        notify();
        System.out.println("Amount: " + amount + " Balance: " + balance);
    }

    public synchronized void pay(float amount) throws InterruptedException {

        while (amount > balance) {
                System.out.println("You don't have enough money. Waiting...");
                wait();
            }
        balance -= amount;
        System.out.println("You paid " + amount + " so now Your balance is: " + balance);
        }
    }

