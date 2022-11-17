import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy {
    private List<Order> orders = new ArrayList<>();
    private boolean happyHour = false;

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (happyHour)
            bar.order(drink, recipe);
        else {
            Order o1 = new Order(drink, recipe, bar);
            orders.add(o1);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        this.happyHour = true;
        for (Order order: orders)
            order.getBar().order(order.getDrink(), order.getRecipe());
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        this.happyHour = false;
    }
}
