package behavioral.iterator.codeIteratorTask;

import java.util.Iterator;

public class Node<T> {
    public T value;
    public Node<T> left, right, parent;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;

        if (left != null)
            left.parent = this;
        if (right != null) {
            right.parent = this;
        }
    }

    public Iterator<Node<T>> preOrder() {
        return new PreOrderIterator(this);
    }
}
