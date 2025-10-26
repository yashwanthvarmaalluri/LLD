package concrete;

import interfaces.BasePizzaInt;

public class PlainPizzaConc implements BasePizzaInt {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 200.0;
    }
}
