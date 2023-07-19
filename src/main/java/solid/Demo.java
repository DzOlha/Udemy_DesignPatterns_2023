package solid;

import solid.openClosed.SpecificationPattern.Filter.impl.BetterFilter;
import solid.openClosed.SpecificationPattern.Model.Color;
import solid.openClosed.SpecificationPattern.Model.Product;
import solid.openClosed.SpecificationPattern.Model.Size;
import solid.openClosed.SpecificationPattern.Specification.impl.AndSpecification;
import solid.openClosed.SpecificationPattern.Specification.impl.ColorSpecification;
import solid.openClosed.SpecificationPattern.Specification.impl.SizeSpecification;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        BetterFilter bf = new BetterFilter();
        System.out.println("Green products: ");
        bf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.name + " is green."));

        System.out.println("Large blue products: ");
        bf.filter(products,
                new AndSpecification<>(
                    new ColorSpecification(Color.BLUE),
                    new SizeSpecification(Size.LARGE)
                ))
                .forEach(p -> System.out.println(" - " + p.name + " is large and blue."));
    }
}
