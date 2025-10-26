public class Vehicle {
    private String licensePlate;
    private VehicleType type;

    public Vehicle(String plate, VehicleType type) {
        this.licensePlate = plate;
        this.type = type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getType() {
        return type;
    }
}