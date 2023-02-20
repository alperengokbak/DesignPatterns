package Lab5_Quiz;

public class ChicagoStyleVeggie extends Pizza{

    public ChicagoStyleVeggie() {
        name =  "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough.";
        sauce = "Plum Tomato Sauce";

        toppings.add("Veggie.");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices.");
    }
}
