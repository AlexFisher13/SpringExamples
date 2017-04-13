import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tkachenko on 12.04.2017.
 */
public class App {

    Client client;
    EventLogger eventLogger;


    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }


    public void logEvent(String msg) {

        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        App app = (App) ctx.getBean("app");
        app.logEvent("Some event for user 1");
        app.logEvent("Some event for user 1");
    }

}
