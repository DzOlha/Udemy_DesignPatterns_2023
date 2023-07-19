package solid.openClosed.SpecificationPattern.Specification;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
