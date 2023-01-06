package Lab5_Quiz;

public class ChicagoStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        
        if (type == "Cheese") {
            pizza = new ChicagoStyleCheesePizza();
        }
        else if(type == "Clam"){
            pizza = new ChicagoStyleClam();
        }
        else if(type == "Pepperoni"){
            pizza = new ChicagoStylePepperoni();
        }
        else if(type == "Veggie"){
            pizza = new ChicagoStyleVeggie();
        }
        return pizza;
    }
}
