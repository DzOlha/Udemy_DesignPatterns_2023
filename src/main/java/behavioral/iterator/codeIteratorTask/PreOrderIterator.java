package behavioral.iterator.codeIteratorTask;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

//Root -> Left -> Right
public class PreOrderIterator<T> implements Iterator<Node<T>> {
    private Node<T> root;
    private final Deque<Node<T>> stack = new ArrayDeque<>();

    public PreOrderIterator(Node<T> root) {
        this.root = root;
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Node<T> next() {
        /* pop will throw NSEE if the stack is empty anyway,
           so you don't need to explicitly throw one,
           unless you want a custom message of course */

        Node<T> node = stack.pop(); // we are going to return the value of this later

        /* the next node to visit is the left node, then the right node
           so we should push the right node first, then the left node,
           which causes the left node to be popped *first**/
        if (node.right != null) {
            stack.push(node.right);
        }
        if (node.left != null) {
            stack.push(node.left);
        }
        return node;
    }
}
