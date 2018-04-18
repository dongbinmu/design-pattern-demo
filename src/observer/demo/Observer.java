package observer.demo;

/**
 * Created by dongbin on 2018/4/19.
 */
public interface Observer {

    String getName();

    //
    void receive();

    //调用

    void send(Subject subject);
}
