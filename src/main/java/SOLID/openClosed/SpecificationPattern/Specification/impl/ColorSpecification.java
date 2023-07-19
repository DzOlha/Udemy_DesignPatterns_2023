package SOLID.openClosed.SpecificationPattern.Specification.impl;


import SOLID.openClosed.SpecificationPattern.Model.Color;
import SOLID.openClosed.SpecificationPattern.Model.Product;
import SOLID.openClosed.SpecificationPattern.Specification.Specification;

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
