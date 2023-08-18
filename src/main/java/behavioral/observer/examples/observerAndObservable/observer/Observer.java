package behavioral.observer.examples.observerAndObservable.observer;

import behavioral.observer.examples.observerAndObservable.PropertyChangedEventArgs;

// observes objects of type T
public interface Observer<T> {
    void handle(PropertyChangedEventArgs<T> args);
}
