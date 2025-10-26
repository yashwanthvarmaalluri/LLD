public class Main {
    public static void main(String[] args) {
        ParkingFloor floor = new ParkingFloor();
        floor.addSpot(new ParkingSpot("S1", SpotType.CAR));
        floor.addSpot(new ParkingSpot("S2", SpotType.BIKE));
        floor.addSpot(new ParkingSpot("S3", SpotType.CAR));

        ParkingLot lot = new ParkingLot(floor);
        EntranceGate entry = new EntranceGate(lot);

        // 👇 Injecting billing strategy here
        ExitGate exit = new ExitGate(new SimpleBilling());

        Vehicle car = new Vehicle("KA01AB1235", VehicleType.CAR);
        Vehicle bike = new Vehicle("KA09XY5678", VehicleType.BIKE);

        Ticket carTicket = entry.generateTicket(car);
        Ticket bikeTicket = entry.generateTicket(bike);

        // Wait here manually or simulate with sleep for 1hr

        if (carTicket != null) exit.processExit(carTicket);
        if (bikeTicket != null) exit.processExit(bikeTicket);
    }
}