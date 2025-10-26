import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> spots = new ArrayList<>();

    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
    }

    public ParkingSpot getFreeSpot(VehicleType type) {
        for (ParkingSpot spot : spots) {
            if (spot.isFree() && spot.getType().name().equals(type.name())) {
                return spot;
            }
        }
        return null;
    }
}