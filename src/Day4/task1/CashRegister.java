package Day4.task1;

public interface CashRegister {

    void addItem(Item item);

    void removeItem(Item item);

    void printPrize(int barcode);

    void addItemToReceipt(int barcode);

    int calculateReceipt();

    void clearReceipt();

}
