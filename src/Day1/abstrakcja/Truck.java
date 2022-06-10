package Day1.abstrakcja;

public class Truck extends Car {

        private int capacity;

        public Truck(String vin, int capacity) {
            super(vin);
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        //dostarczamy implementacje metody abstrakcyjnej
        @Override
        public void drive() {
            System.out.println("Truck drive");
        }
    }

