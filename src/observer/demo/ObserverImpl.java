package observer.demo;

/**
 * Created by dongbin on 2018/4/19.
 */
public class ObserverImpl implements Observer {

    private String name;//区别观察者

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void receive() {
        System.out.println(this.name+"收到通知！");
    }

    @Override
    public void send(Subject subject) {
        System.out.println(this.name+"发送通知");
        subject.notifyObservers(this.name);
    }


}
