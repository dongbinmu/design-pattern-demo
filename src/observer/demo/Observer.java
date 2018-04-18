package observer.demo;

/**
 * Created by dongbin on 2018/4/19.
 */
public interface Observer {

    String getName();

    //申明相应方法
    void doSomething();

    //调用

    void invoke(Subject subject);
}
