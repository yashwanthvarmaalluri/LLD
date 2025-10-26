package toppings;

import abstracts.ToppingsAbstract;
import interfaces.BasePizzaInt;

public class ChickenTopping extends ToppingsAbstract {
    
    public ChickenTopping(BasePizzaInt pizza) {
        super(pizza);
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Chicken Topping";
    }
    
    @Override
    public double getCost() {
        return pizza.getCost() + 20.0;
    }
}
