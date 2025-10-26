
import interfaces.BasePizzaInt;
import concrete.PlainPizzaConc;
import toppings.CheeseTopping;
import toppings.ChickenTopping;

public class Main {
    public static void main(String[] args) {
        // Create base pizza
        BasePizzaInt pizza = new PlainPizzaConc();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
        System.out.println();
        
        // Add cheese topping
        pizza = new CheeseTopping(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
        System.out.println();
        
        // Add chicken topping
        pizza = new ChickenTopping(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
