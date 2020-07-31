class Timer {
    private ClockHand hundredth;
    private ClockHand seconds;

    public Timer() {
        this.hundredth = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredth.advance();

        if (this.hundredth.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.hundredth;
    }
}