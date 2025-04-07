import java.util.ArrayList;
import java.util.List;

public class BatterySubject {
    private List<Observer> observers = new ArrayList<>();
    private int level;

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void setLevel(int level) {
        this.level = level;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(level);
        }
    }
}