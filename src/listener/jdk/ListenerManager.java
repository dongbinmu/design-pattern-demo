package listener.jdk;

import listener.demo.IEventListener;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by dongbin on 2018/4/18.
 */
public class ListenerManager {

    private Collection listeners;

    public void addListener(DEventListener listener) {
        if (listeners == null) {
            listeners = new HashSet();
        }
        listeners.add(listener);
    }

    public void removeListener(IEventListener listener) {
        if (listeners == null) return;
        listeners.remove(listener);
    }



    public void doEvent(String event) {
        if (listeners==null) return;
        DEvent dEvent = new DEvent(this,event);
        notifyListeners(dEvent);
    }

    public void notifyListeners(DEvent event) {
        Iterator iterator = listeners.iterator();
        while (iterator.hasNext()){
            DEventListener eventListener = (DEventListener) iterator.next();
            eventListener.doEvent(event);
        }
    }


}
