package toppings;

import abstracts.ToppingsAbstract;
import interfaces.BasePizzaInt;

public class CheeseTopping extends ToppingsAbstract {
    public CheeseTopping(BasePizzaInt pizza) {
        super(pizza);
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Cheese Topping";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10.0;
    }
}
