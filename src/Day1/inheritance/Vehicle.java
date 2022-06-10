package Day1.inheritance;

public class Vehicle {

    private String vehicleName;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void drive() {
        System.out.println("drive");
    }
}
