/**
 * Created by Tkachenko on 12.04.2017.
 */
public class ConsoleEventLogger implements EventLogger{

    public void logEvent(Event event) {
        System.out.println(event.toString());
    }
}
