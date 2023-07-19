package SOLID.openClosed.SpecificationPattern.Filter;

import SOLID.openClosed.SpecificationPattern.Specification.Specification;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
    Stream<T> filter(List<T> items, Specification<T> spec);
}
