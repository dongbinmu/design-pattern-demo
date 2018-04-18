package observer.demo;

/**
 * Created by dongbin on 2018/4/19.
 */
public class Main {
    public static void main(String[] args) {
        Observer observer1 = new ObserverImpl("王五");
        Observer observer2 = new ObserverImpl("张三");
        Observer observer3 = new ObserverImpl("李四");
        Subject subject = new SubjectImpl();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        observer1.send(subject);

    }
}
