package structural.adapter.codeAdapterTask.model;

public interface Rectangle {
    int getWidth();

    int getHeight();

    default int getArea() {
        return getWidth() * getHeight();
    }
}
