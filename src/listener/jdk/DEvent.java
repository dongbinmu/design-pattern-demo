package listener.jdk;

import java.util.EventObject;

/**
 * Created by dongbin on 2018/4/18.
 */
public class DEvent extends EventObject {

    private String status;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public DEvent(Object source,String status) {
        super(source);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
