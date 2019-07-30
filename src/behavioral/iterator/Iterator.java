package behavioral.iterator;

public interface Iterator<E> {
    boolean hasNext();

    E currentItem();

    E next();
}
