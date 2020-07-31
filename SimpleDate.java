public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public void advance(int howManyDays) {
        this.day += howManyDays;

        if (this.day > 30) {
            this.day = 1;
            this.month += 1;
        }

        if (this.month > 12) {
            this.year += 1;
        }
    }

    public SimpleDate afterHowManyDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        newDate.advance(days);
        return newDate;
    }
}