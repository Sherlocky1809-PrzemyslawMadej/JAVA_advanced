package naukaWlasna;

import java.util.List;

public class Statistics {

    private double average;
    private List<Integer> values;

    public Statistics(final double average, final List<Integer> values) {
        this.average = average;
        this.values = values;
    }

    public double getAverage() {
        return average;
    }

    public List<Integer> getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "average=" + average +
                ", values=" + values +
                '}';
    }
}
