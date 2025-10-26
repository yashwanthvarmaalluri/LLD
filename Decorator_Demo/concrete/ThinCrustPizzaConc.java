package concrete;

import interfaces.BasePizzaInt;

public class ThinCrustPizzaConc implements BasePizzaInt {
    @Override
    public String getDescription() {
        return "Thin Crust Pizza";
    }

    @Override
    public double getCost() {
        return 250.0;
    }
}
