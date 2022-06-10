package Day4.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CashRegisterImpl implements CashRegister {

    private Map<Integer, Item> mapOfItems = new HashMap<>();
    private List<Item> receipt = new ArrayList<>();

    @Override
    public void addItem(Item item) {
        mapOfItems.put(Integer.valueOf(item.getBarcode()), item);
    }

    @Override
    public void removeItem(Item item) {
        mapOfItems.remove(item.getBarcode(), item);
    }

    @Override
    public void printPrize(int barcode) {
        Item item = mapOfItems.get(barcode);
        System.out.println(item.getPrize());
    }

    @Override
    public void addItemToReceipt(int barcode) {

        Item item = mapOfItems.get(barcode);
        receipt.add(item);
        System.out.println(item);

    }

    @Override
    public int calculateReceipt() {
        int sum = 0;
        for (Item item: receipt) {
            int prize = item.getPrize();
            sum += prize;
            clearReceipt();
        }
        return sum;
    }

    @Override
    public void clearReceipt() {
//        receipt.clear();
        receipt = new ArrayList<>();
    }

    @Override
    public String toString() {
        return mapOfItems.toString();
    }
}
