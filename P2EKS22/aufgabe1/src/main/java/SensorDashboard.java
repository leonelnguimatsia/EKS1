import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SensorDashboard {
    private final ISensor sensor;
    @Inject
    @Named("BottomAlarmBoundary")
    private Integer bottomAlarmBoundary;
    @Inject
    @Named("UpperAlarmBoundary")
    private Integer upperAlarmBoundary;

    @Inject
    public SensorDashboard(@Named("Sensor") ISensor sensor) {
        this.sensor = sensor;
    }

    public void ausgabeSensorWerte() {
        Integer sensorValue;
        for (int i = 0; i < 10; i++) {
            sensorValue = sensor.gibWert();
            System.out.print("\nWert: " + sensorValue + "; ");
            if (sensorValue <= this.bottomAlarmBoundary)
                System.out.print("Achtung: aktueller Wert niedriger als untere Alarmgrenze!");
            else if (sensorValue >= this.upperAlarmBoundary)
                System.out.print("Achtung: aktueller Wert höher als obere Alarmgrenze!");
        }
    }
}
