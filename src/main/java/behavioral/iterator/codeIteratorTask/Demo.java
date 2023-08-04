package behavioral.iterator.codeIteratorTask;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(
                8,
                        new Node<>(3, new Node<>(5), new Node<>(6)),
                        new Node<>(4, null, new Node<>(2))
        );
        Iterator<Node<Integer>> it = root.preOrder();

        /* 8 3 5 6 4 2 */
       while(it.hasNext()) {
           System.out.println(it.next().value);
       }
    }
}
