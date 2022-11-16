public class StringCaseChanger implements StringTransformer {

    public StringCaseChanger() {}
    public void execute(StringDrink drink) {
        StringBuilder sb = new StringBuilder(drink.getText());
        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);
            if (Character.isLowerCase(currentChar))
                sb.setCharAt(i, Character.toUpperCase(currentChar));
            else
                sb.setCharAt(i, Character.toLowerCase(currentChar));
        }
        String newText = sb.toString();
        drink.setText(newText);
    }
}
