package Lab5_Quiz;

public class ChicagoStylePepperoni extends Pizza{

    public ChicagoStylePepperoni() {
        name =  "Chicago Style Deep Dish Pepporini Pizza";
        dough = "Extra Thick Crust Dough.";
        sauce = "Plum Tomato Sauce";

        toppings.add("Pepporoni.");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices.");
    }
    
}
