/** 
 * Linked list version of a stack ADT
 * uses already implemented SinglyLinkedList ADT
 * @author Joseph
 */
public class LinkedStack<E> implements Satck<E> {
	private SinglyLinkedList<E> list = new SinglyLinkedList<>(); // empty list
	public LinkedStack(){}         // new stack relies on the intially empty list
	public int size() { return list.size();}
	public boolean isEmpty() {return list.isEmpty(); }
	public void push(E element) { list.addFirst(element);}
	public E top() {return list.first();}
	public E pop() {return list.removeFirst();}
	
}