public class ParkingLot {
    private ParkingFloor floor;

    public ParkingLot(ParkingFloor floor) {
        this.floor = floor;
    }

    public ParkingSpot findSpot(VehicleType type) {
        return floor.getFreeSpot(type);
    }
}