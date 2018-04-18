package listener.demo;

import java.util.EventListener;

/**
 * Created by dongbin on 2018/4/18.
 */
public interface IEventListener extends EventListener{
    void doEvent(IEvent event);
}
