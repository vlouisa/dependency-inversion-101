package nl.devoteam.di.exercise03;

public class Alarm {
    private SafetyRange safetyRange = new SafetyRange(17, 21);
    private Sensor sensor = new Sensor();
    private boolean alarmOn = false;

    public void check(){
        if (!safetyRange.withinRange(sensor.popNextPressurePsiValue())) {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn(){
        return alarmOn;
    }
}
