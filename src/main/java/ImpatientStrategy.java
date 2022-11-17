public class ImpatientStrategy implements OrderingStrategy {
    private boolean happyHour;

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        bar.order(drink, recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        this.happyHour = true;
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        this.happyHour = false;
    }
}
