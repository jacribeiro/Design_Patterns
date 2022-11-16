public class StringReplacer implements StringTransformer {
    private char current;
    private char toReplace;

    public StringReplacer(char current, char toReplace) {
        this.current = current;
        this.toReplace = toReplace;
    }

    public void execute(StringDrink drink) {
        String toChange = drink.getText();
        toChange = toChange.replace(current, toReplace);
        drink.setText(toChange);
    }
}
