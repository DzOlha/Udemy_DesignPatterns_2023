package behavioral.observer.examples.observerAndObservable.observeble;

import behavioral.observer.examples.observerAndObservable.PropertyChangedEventArgs;
import behavioral.observer.examples.observerAndObservable.observer.Observer;

import java.util.ArrayList;
import java.util.List;

// can be observed
public class Observable<T> {
    private List<Observer<T>> observers = new ArrayList<>();

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    protected void propertyChanged(T source,
                                   String propertyName,
                                   Object newValue) {
        for (Observer<T> o : observers)
            o.handle(new PropertyChangedEventArgs<T>(
                    source, propertyName, newValue
            ));
    }
}
