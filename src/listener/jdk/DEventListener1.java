package listener.jdk;

/**
 * Created by dongbin on 2018/4/18.
 */
public class DEventListener1 implements DEventListener {


    @Override
    public void doEvent(DEvent event) {
        if ("open".equals(event.getStatus())) {
            System.out.println("打开1");
        }else if ("close".equals(event.getStatus())){
            System.out.println("关闭1");
        }
    }
}
