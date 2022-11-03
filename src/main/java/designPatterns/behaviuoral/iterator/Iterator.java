package designPatterns.behaviuoral.iterator;

public interface Iterator<T extends Comparable<T>> {
    boolean hasNext();
    T next();
}
