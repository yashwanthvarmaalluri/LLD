public interface BillingStrategy {
    long calculate(Vehicle vehicle, long hours);
}