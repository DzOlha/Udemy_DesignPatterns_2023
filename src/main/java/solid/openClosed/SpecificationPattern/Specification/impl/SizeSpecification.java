package solid.openClosed.SpecificationPattern.Specification.impl;

import solid.openClosed.SpecificationPattern.Model.Product;
import solid.openClosed.SpecificationPattern.Model.Size;
import solid.openClosed.SpecificationPattern.Specification.Specification;

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
