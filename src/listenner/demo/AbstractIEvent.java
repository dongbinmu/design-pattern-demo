package listenner.demo;

/**
 * Created by dongbin on 2018/4/18.
 */
public abstract class AbstractIEvent implements IEvent {

    @Override
    public abstract void setEventListener(IEventListener listener);
}
