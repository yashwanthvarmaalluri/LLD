public class SimpleBilling implements BillingStrategy {
    public long calculate(Vehicle vehicle, long hours) {
        if (vehicle.getType() == VehicleType.CAR) return hours * 6;
        if (vehicle.getType() == VehicleType.BIKE) return hours * 1;
        return 0;
    }
}