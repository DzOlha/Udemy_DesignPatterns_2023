package behavioral.observer.examples.observerAndObservable.observeble.model;

import behavioral.observer.examples.observerAndObservable.observeble.Observable;

public class Person extends Observable<Person> {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age == age) return;
        this.age = age;
        propertyChanged(this, "age", age);
    }
}
