public class ParkingSpot {
    private String id;
    private SpotType type;
    private boolean isFree = true;
    private Vehicle vehicle;

    public ParkingSpot(String id, SpotType type) {
        this.id = id;
        this.type = type;
    }

    public boolean assignVehicle(Vehicle v) {
        if (isFree && v.getType().name().equals(type.name())) {
            vehicle = v;
            isFree = false;
            return true;
        }
        return false;
    }

    public void removeVehicle() {
        vehicle = null;
        isFree = true;
    }

    public boolean isFree() {
        return isFree;
    }

    public SpotType getType() {
        return type;
    }

    public String getId() {
        return id;
    }
}