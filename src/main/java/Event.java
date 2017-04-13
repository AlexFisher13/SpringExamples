import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Tkachenko on 12.04.2017.
 */
public class Event {


    private int id;
    private String msg;
    private Date date;
    private DateFormat df;

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                ", df=" + df +
                '}';
    }
}
