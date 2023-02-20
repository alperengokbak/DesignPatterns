package Lab5_Quiz;

public class Main {
    public static void main(String[] args) {
        NyStore nyStore = new NyStore();
        Pizza pizza = nyStore.orderPizza("Cheese");
        System.out.println("Alper ordered a NY Style Sauce and Cheese Pizza");
        System.out.println(pizza);

        ChicagoStore chicagoStore = new ChicagoStore();
        Pizza pizza2 = chicagoStore.orderPizza("Cheese");
        System.out.println("Toprak ordered a Chiago Style Sauce and Cheese Pizza");
        System.out.println(pizza2);
    }
}
