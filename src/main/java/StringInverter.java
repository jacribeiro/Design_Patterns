public class StringInverter implements StringTransformer {

    public StringInverter() {}
    public void execute(StringDrink drink) {
        StringBuilder sb = new StringBuilder(drink.getText());
        sb.reverse();
        String newText = sb.toString();
        drink.setText(newText);
    }
}
