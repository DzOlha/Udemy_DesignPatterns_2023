package structural.decorator.examples.dynamicDecoratorComposition;

import structural.decorator.examples.dynamicDecoratorComposition.shape.impl.Circle;
import structural.decorator.examples.dynamicDecoratorComposition.decorator.ColoredShape;
import structural.decorator.examples.dynamicDecoratorComposition.shape.impl.Square;
import structural.decorator.examples.dynamicDecoratorComposition.decorator.TransparentShape;

// we are NOT altering the base class of these objects
// cannot make ColoredSquare, ColoredCircle

class Demo
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(new Square(20), "blue");
        System.out.println(blueSquare.info());

        TransparentShape myCircle = new TransparentShape(new ColoredShape(new Circle(5), "green"), 50);
        System.out.println(myCircle.info());

        // cannot call myCircle.resize()
    }
}

