public class StringBar extends Bar {
    private boolean happyHour;

    public StringBar() {
        this.happyHour = false;
    }

    public boolean isHappyHour() {
        return this.happyHour == true;
    }

    public void startHappyHour() {
        this.happyHour = true;
    }

    public void endHappyHour() {
        this.happyHour = false;
    }
}
