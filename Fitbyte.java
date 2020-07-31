public class Fitbyte {
    private int age;
    private int restingHeartRate;
  
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return ((this.calculateMaximumHeartRate(this.age) - this.restingHeartRate) * (percentageOfMaximum)) + this.restingHeartRate;
    }

    private double calculateMaximumHeartRate(int age) {
        return 206.3 - (0.711 * age);
    }
}