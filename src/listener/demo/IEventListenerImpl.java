package listener.demo;

/**
 * Created by dongbin on 2018/4/19.
 */
public class IEventListenerImpl implements IEventListener {
    @Override
    public void doEvent(IEvent event) {
        if(event instanceof ButtonEventSource){
            System.out.println("您点击了button！");
        }else if (event instanceof MouseEventSource){
            System.out.println("您移动了鼠标！");
        }
    }
}
