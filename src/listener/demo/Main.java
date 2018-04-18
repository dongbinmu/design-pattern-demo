package listener.demo;

/**
 * Created by dongbin on 2018/4/18.
 */
public class Main {

    public static void main(String[] args) {

        IEventListener listener = new IEventListenerImpl();

        ButtonEventSource buttonEventSource = new ButtonEventSource();
        buttonEventSource.setEventListener(listener);
        buttonEventSource.buttonEventHappened();

        MouseEventSource mouseEventSource = new MouseEventSource();
        mouseEventSource.setEventListener(listener);
        mouseEventSource.mouseEventHappened();
    }
}
