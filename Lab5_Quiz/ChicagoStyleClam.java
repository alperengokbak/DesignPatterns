package Lab5_Quiz;

public class ChicagoStyleClam extends Pizza{

    public ChicagoStyleClam() {
        name =  "Chicago Style Deep Dish Clam Pizza";
        dough = "Extra Thick Crust Dough.";
        sauce = "Plum Tomato Sauce";

        toppings.add("Clam.");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices.");
    }
    
}
