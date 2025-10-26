package abstracts;

import interfaces.BasePizzaInt;

public abstract class ToppingsAbstract implements BasePizzaInt {
    protected BasePizzaInt pizza;

    public ToppingsAbstract(BasePizzaInt pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
