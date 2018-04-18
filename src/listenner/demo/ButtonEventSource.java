package listenner.demo;

/**
 * Created by dongbin on 2018/4/18.
 */
public class ButtonEventSource extends AbstractIEvent {

    private IEventListener listener;

    @Override
    public void setEventListener(IEventListener listener) {
        this.listener = listener;
    }

    public void buttonEventHappened() {
        listener.doEvent(this);
    }
}