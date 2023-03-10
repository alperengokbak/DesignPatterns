package Lab5_Quiz;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList <String> toppings = new ArrayList<String>();
    
    public String getName() {
        return name;
    }
    
    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough..." + dough);
        System.out.println("Adding sauce..." + sauce);
        System.out.println("Adding toppings:");
        for(String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
    void bake(){
        System.out.println("Bake for 25 minutes at 350.");
    }
    void cut(){
        System.out.println("Cutting the pizza into diognal slices.");
    }
    void box(){
        System.out.println("Place pizza in offical PizzaStore box.");
    }

}