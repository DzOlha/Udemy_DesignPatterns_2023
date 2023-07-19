package solid.openClosed.SpecificationPattern.Specification.impl;


import solid.openClosed.SpecificationPattern.Model.Color;
import solid.openClosed.SpecificationPattern.Model.Product;
import solid.openClosed.SpecificationPattern.Specification.Specification;

public class ColorSpecification implements Specification<Product>
{
    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color == color;
    }
}
