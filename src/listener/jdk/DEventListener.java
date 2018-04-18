package listener.jdk;

import java.util.EventListener;

/**
 * Created by dongbin on 2018/4/18.
 */
public interface DEventListener extends EventListener {
    void doEvent(DEvent event);
}
