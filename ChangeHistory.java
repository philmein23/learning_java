import java.util.ArrayList;

public class ChangeHistory {

    ArrayList<Double> changes;

    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }

    public void add(double status) {
        this.changes.add(status);
    }

    public void clear() {
        this.changes.clear();
    }

    public double maxValue() {
        double max = this.changes.get(0);
        for (double val : this.changes) {
            if (max > val) {
                val = max;
            }
        }

        return max;
    }

    public double minValue() {
        double min = this.changes.get(0);
        for (double val : this.changes) {
            if (val < min) {
                min = val;
            }
        }

        return min;
    }

    public double average() {
        return this.changes.stream().mapToDouble(Double::valueOf).sum() / this.changes.size();
    }

}