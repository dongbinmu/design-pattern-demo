package observer.demo;

import java.util.Iterator;

/**
 * Created by dongbin on 2018/4/19.
 */
public class SubjectImpl extends Subject {

    @Override
    public void notifyObservers(String name) {
        Iterator iterator = getObservers().iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            if (!name.equalsIgnoreCase(observer.getName())) {
                observer.doSomething();
            }
        }
    }
}
