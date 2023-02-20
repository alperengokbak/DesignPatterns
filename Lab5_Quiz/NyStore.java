package Lab5_Quiz;

public class NyStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        
        if (type == "Cheese") {
            pizza = new NYStyleCheesePizza();
        }
        else if(type == "Clam"){
            pizza = new NyStyleClam();
        }
        else if(type == "Pepperoni"){
            pizza = new NyStylePepperoni();
        }
        else if(type == "Veggie"){
            pizza = new NyStyleVeggie();
        }
        return pizza;
    }

}
