package listener.jdk;

/**
 * Created by dongbin on 2018/4/18.
 */
public class Main {
    public static void main(String[] args) {
        ListenerManager manager = new ListenerManager();
        manager.addListener(new DEventListener2());
        manager.addListener(new DEventListener1());

        manager.doEvent("open");
        manager.doEvent("close");
    }
}
