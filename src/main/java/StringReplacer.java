public class StringReplacer implements StringTransformer {
    private char current;
    private char toReplace;

    public StringReplacer(char current, char toReplace) {
        this.current = current;
        this.toReplace = toReplace;
    }

    public void execute(StringDrink drink) {
        StringBuilder sb = new StringBuilder(drink.getText());
        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);
            if (currentChar == current) {
                sb.replace(i, i+1, String.valueOf(toReplace));
            }
        }
        String newText = sb.toString();
        drink.setText(newText);
    }
}
