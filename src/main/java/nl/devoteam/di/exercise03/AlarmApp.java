package nl.devoteam.di.exercise03;

public class AlarmApp {

    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        alarm.check();
        if(alarm.isAlarmOn()){
            System.out.println("Alarm staat AAN!!!");
        } else{
            System.out.println("Alarm staat UIT!!!");
        }

    }

}
