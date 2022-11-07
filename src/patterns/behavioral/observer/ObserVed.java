package patterns.behavioral.observer;

public interface ObserVed {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
