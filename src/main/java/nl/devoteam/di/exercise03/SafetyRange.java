package nl.devoteam.di.exercise03;

public class SafetyRange {
    private final double lowPressureThreshold;
    private final double highPressureThreshold;

    public SafetyRange(double lowPressureThreshold, double highPressureThreshold) {

        this.lowPressureThreshold = lowPressureThreshold;
        this.highPressureThreshold = highPressureThreshold;
    }

    public boolean withinRange(double probedPressure) {
        return probedPressure >= lowPressureThreshold &&  probedPressure <= highPressureThreshold;
    }
}
