import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class BasicModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Integer.class).annotatedWith(Names.named("BottomAlarmBoundary")).toInstance(3);
        bind(Integer.class).annotatedWith(Names.named("UpperAlarmBoundary")).toInstance(8);
        bind(ISensor.class).annotatedWith(Names.named("Sensor")).to(DummySensor.class);
    }
}
