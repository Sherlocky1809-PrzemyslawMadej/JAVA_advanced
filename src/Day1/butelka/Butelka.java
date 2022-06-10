package Day1.butelka;

public class Butelka {

    private int capacity;  // pojemność
    private int amountOfWater; // ilość wody na ten moment
    private String barCode; // kod kreskowy

    public Butelka(int capacity, int amountOfWater, String barCode) {
        this.capacity = capacity;
        this.amountOfWater = amountOfWater;
        this.barCode = barCode;
    }



    public int fillBottle(int amount) {

        if (amount <= 0) {
            System.out.println("Zła wartość");
            return 0;
        }
        amountOfWater += amount;
        if (amountOfWater > capacity) {
            amountOfWater = capacity;
        }
        return amountOfWater;
    }

    public int removeWaterFromBottle(int amount) {
        amountOfWater -= amount;
        if (amountOfWater <= 0) {
            amountOfWater = 0;
        }
        return amountOfWater;
    }

    public void pourBottleToBottle(Butelka otherBottle, int amount) {

        if (amountOfWater >= amount && amount > 0) {
//            int amountToPourFromFirstBottle = otherBottle.fillBottle(amount2);
//            amountOfWater -= amountToPourFromFirstBottle;
            this.removeWaterFromBottle(amount);
            otherBottle.fillBottle(amount);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAmountOfWater() {
        return amountOfWater;
    }

    public String getBarCode() {
        return barCode;
    }

    @Override
    public String toString() {
        return "Butelka{" +
                "capacity=" + capacity +
                ", amountOfWater=" + amountOfWater +
                ", barCode='" + barCode + '\'' +
                '}';
    }
}
