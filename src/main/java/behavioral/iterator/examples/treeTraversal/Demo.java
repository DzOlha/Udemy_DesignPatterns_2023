package behavioral.iterator.examples.treeTraversal;

import behavioral.iterator.examples.treeTraversal.iterable.BinaryTree;
import behavioral.iterator.examples.treeTraversal.iterators.InOrderIterator;
import behavioral.iterator.examples.treeTraversal.model.Node;

class Demo
{
    public static void main(String [] args)
    {
        //   1
        //  / \
        // 2   3
        Node<Integer> root = new Node<>(1,
                new Node<>(2),
                new Node<>(3));

        InOrderIterator<Integer> it = new InOrderIterator<>(root);

        while (it.hasNext())
        {
            System.out.print("" + it.next() + ",");
        }
        System.out.println();

        BinaryTree<Integer> tree = new BinaryTree<>(root);
        for (int n : tree)
            System.out.print("" + n + ",");
        System.out.println();
    }
}