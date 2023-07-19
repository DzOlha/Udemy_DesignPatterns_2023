package SOLID.openClosed.SpecificationPattern.Filter.impl;


import SOLID.openClosed.SpecificationPattern.Model.Product;
import SOLID.openClosed.SpecificationPattern.Specification.Specification;

import java.util.List;
import java.util.stream.Stream;
import SOLID.openClosed.SpecificationPattern.Filter.Filter;

public class BetterFilter implements Filter<Product>
{
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(p -> spec.isSatisfied(p));
    }
}
