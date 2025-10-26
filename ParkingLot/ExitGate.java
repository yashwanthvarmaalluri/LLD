import java.time.Duration;
import java.time.LocalDateTime;

public class ExitGate {
    private BillingStrategy billingStrategy;

    public ExitGate(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public void processExit(Ticket ticket) {
        ParkingSpot spot = ticket.getSpot();
        Vehicle vehicle = ticket.getVehicle();

        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        long hoursParked = Duration.between(entryTime, exitTime).toHours();
        if (hoursParked == 0) hoursParked = 1;

        long amount = billingStrategy.calculate(vehicle, hoursParked);

        System.out.println("Vehicle exited: " + vehicle.getLicensePlate());
        System.out.println("Parked for " + hoursParked + " hour(s)");
        System.out.println("Amount to pay: $" + amount);

        spot.removeVehicle();
    }
}