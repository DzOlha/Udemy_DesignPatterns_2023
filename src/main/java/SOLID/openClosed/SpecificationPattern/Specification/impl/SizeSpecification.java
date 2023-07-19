package SOLID.openClosed.SpecificationPattern.Specification.impl;

import SOLID.openClosed.SpecificationPattern.Model.Product;
import SOLID.openClosed.SpecificationPattern.Model.Size;
import SOLID.openClosed.SpecificationPattern.Specification.Specification;

public class SizeSpecification implements Specification<Product>
{
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == size;
    }
}
