package lezioni.pizza_overloaded_method;
public class Main {
    public static void main(String[] args) {

        Pizza pizzaConExtra = new Pizza("farina", "pomodoro", "mozzarella", "salsiccia");

        Pizza pizzaBianca = new Pizza("farina"); 
        System.out.println(pizzaBianca);
    }
}