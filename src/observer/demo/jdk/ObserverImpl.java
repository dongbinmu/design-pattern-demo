package observer.demo.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dongbin on 2018/4/19.
 */
public class ObserverImpl implements Observer{


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("接受消息");
    }


}
