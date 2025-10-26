public class EntranceGate {
    private ParkingLot lot;

    public EntranceGate(ParkingLot lot) {
        this.lot = lot;
    }

    public Ticket generateTicket(Vehicle vehicle) {
        ParkingSpot spot = lot.findSpot(vehicle.getType());
        if (spot != null && spot.assignVehicle(vehicle)) {
            System.out.println("Assigned spot: " + spot.getId() + " for vehicle: " + vehicle.getLicensePlate() + " " + vehicle.getType());
            return new Ticket(vehicle, spot);
        } else {
            System.out.println("No available spot for: " + vehicle.getType());
            return null;
        }
    }
}