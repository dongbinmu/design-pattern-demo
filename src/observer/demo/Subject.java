package observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongbin on 2018/4/19.
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void addObserver(Observer observer) {
        System.out.println(observer.getName()+"加入了观察组");
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        System.out.println(observer.getName()+"离开了观察组");
        observers.remove(observer);
    }

     abstract void notifyObservers(String name);
}
