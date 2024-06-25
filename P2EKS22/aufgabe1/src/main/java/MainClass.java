import com.google.inject.Guice;
import com.google.inject.Injector;

public class MainClass {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BasicModule());
        SensorDashboard sensorDashboard = injector.getInstance(SensorDashboard.class);
        sensorDashboard.ausgabeSensorWerte();
    }
}
