package creational.builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder().topping1("Pizza").topping2("Cheese").topping3("Tomato").build();
        System.out.println(pizza.topping1);
        System.out.println(pizza.topping2);
        Pizza pizza1 = new Pizza.Builder().topping3("Cheese").build();
        System.out.println(pizza1.topping3);
    }
}
