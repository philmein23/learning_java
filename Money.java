public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(euros + addition.euros, cents + addition.cents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }

        return false;
    }

    public Money minus(Money decreaser) {
        int diff = this.euros - decreaser.euros;
        int diff2 = this.cents - decreaser.cents;

        Money newMoney;
        if (diff2 < 0){
            diff -= 1;
            diff2 = Math.abs(diff2);
        }
        if (diff < 0) {
            newMoney = new Money(0, 0);
        } else {
             newMoney = new Money(diff, diff2);
        }

        return newMoney;
    }
}