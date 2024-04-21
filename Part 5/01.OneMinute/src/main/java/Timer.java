public class Timer {

    private ClockHand hundredths;
    private ClockHand seconds;

    public Timer() {
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public String toString() {
        return this.seconds + ":" + this.hundredths;
    }

    public void advance() {
        if (this.hundredths.value() >= 99) {
            this.seconds.advance();
        }
        this.hundredths.advance();

    }
}