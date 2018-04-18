package listenner.demo;

/**
 * Created by dongbin on 2018/4/18.
 */
public class Main {

    public static void main(String[] args) {

        IEventListener listener = event -> {
            if(event instanceof ButtonEventSource){
                System.out.println("您点击了button！");
            }else if (event instanceof MouseEventSource){
                System.out.println("您移动了鼠标！");
            }

        };

        ButtonEventSource buttonEventSource = new ButtonEventSource();
        buttonEventSource.setEventListener(listener);
        buttonEventSource.buttonEventHappened();

        MouseEventSource mouseEventSource = new MouseEventSource();
        mouseEventSource.setEventListener(listener);
        mouseEventSource.mouseEventHappened();
    }
}
