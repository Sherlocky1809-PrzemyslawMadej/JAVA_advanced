package Day3.account;

public class AccountApp {

    public static void main(String[] args) {

        Account account = new Account();
        account.setName("Konto premium");
        System.out.println("Nazwa: " + account.getName());
        System.out.println("Stan konta: " + account.getBalance());
        System.out.println(account.isDebit());
//        account.withdraw(1000);
        System.out.println("Stan konta po wplacie: " + account.getBalance());
//        System.out.println("Debit po wyplacie: " + account.isDebit());
//        account.deposit(5000);
//        System.out.println("Debit po wplacie: " + account.isDebit());

        System.out.println("*******************************");

        Account otherAccount = new Account();
        account.transfer(otherAccount, 1000);
        account.transfer(otherAccount, 1);
        System.out.println("Stan konta po transferze: " + account.getBalance());
        System.out.println("Stan konta po transferze do drugiego konta: " + otherAccount.getBalance());



    }
}
