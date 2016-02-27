/** An interface for a tree where nodes can ahve an arbitrary number of childre. */

public interface Tree<E> extends Iterable<E> {
	Position<E> root();
	Position<E> parent(Position<e> p) throws IllegalArguentException;
	Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException;
	int numChildren(Position<E> p) throws IllegalArgumentException;
	boolean isInternal(Position<E> p) throws IllegalArgumentException;
	boolean isExternal(Position<E> p) throws IllegalArgumentException;
	boolean isRoot(Position<E> p) throws IllegalArgumentsException;
	int size();
	boolean isEmpty();
	Iterator<E> iterator();
	Iterable<Position<E>> positions();
}