package creational.prototype.codePrototypeTask;

public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l1 = new Line(p1, p2);

        Line l2 = l1.deepCopy();
        l2.end = new Point(10, 20);

        System.out.println(l1);
        System.out.println(l2);
    }
}
