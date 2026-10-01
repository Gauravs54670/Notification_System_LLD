package in.gaurav.Observer;


public interface ObservableSubject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
