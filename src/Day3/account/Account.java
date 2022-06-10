package Day3.account;

public class Account {

    private String name;
    private int balance;
    private boolean debit; // domyslnie jest false.
    private static final int MAX_DEBIT = -1000;

//    public Account(String name, int balance) {
//        this.name = name;
//        this.balance = balance;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isDebit() {
        return debit;
    }

    public void deposit(int amount) {

        validateAmount(amount);
        validateAvailableBalance(amount);
        int balanceBeforeDeposit = balance;

            balance += amount;
            validateDebit();
            System.out.println("Stan konta: " + balanceBeforeDeposit + " |Wpłata: " + amount +
                    " |Stan konta po operacji: " + getBalance());
        }

    public void withdraw(int amount) {
    validateAmount(amount);
    validateAvailableBalance(amount);
    int balanceBeforeWithdraw = balance;

            balance -= amount;
            validateDebit();
            System.out.println("Stan konta: " + balanceBeforeWithdraw + " |Wypłata: " + amount +
                    " |Stan konta po operacji: " + getBalance());
        }

    private void validateAmount(int amount) {
        if(amount <= 0) {
            throw new RuntimeException("Kwota wpłaty musi być dodatnia! Kwota: " + amount);
        }
    }

    private void validateDebit() {
        if (balance < 0) {
            debit = true;
        } else {
            debit = false;
        }
    }

    private void validateAvailableBalance(int amount) {
        if(balance - amount < MAX_DEBIT) {
            throw new RuntimeException("Nie mozna wykonac operacji. ");
        }
    }

    public void transfer(Account other, int amount) {
            this.withdraw(amount);
            other.deposit(amount);
        }
    }


