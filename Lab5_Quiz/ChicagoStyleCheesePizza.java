package Lab5_Quiz;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name =  "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough.";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shreedded Mozerella Cheese.");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices.");
    }
}
