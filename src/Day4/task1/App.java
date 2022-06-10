package Day4.task1;

public class App {

    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegisterImpl();
        cashRegister.addItem(new Item(20, "majtki", 124563));
        cashRegister.addItem(new Item(35, "rice", 124002));
        System.out.println(cashRegister);
        cashRegister.printPrize(124563);

        cashRegister.addItemToReceipt(124563);
        cashRegister.addItemToReceipt(124002);

        System.out.println(cashRegister.calculateReceipt());
        cashRegister.removeItem(new Item(35, "rice", 124002));
        System.out.println(cashRegister);

    }
}
