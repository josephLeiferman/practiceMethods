/** 
 * An array implentation of Stack interface with concrete methods 
 * Do not use the implentation because of lack of dynamic storage
 * @author Joseph
 */
public class ArrayStackStatic<E> implements Stack<E> {
	public static final int CAPACITY =1000;//defualt array capacity
	private E[] data;                      // deneric array used for storage
	private int t = -1;                    // index of the top element in stack
	public ArrayStack(){this(CAPACITY);}   // constructs stack with default capacity
	public ArrayStack(int capacity): {     // constucts stack with given capacity
		data = (E[]) new Object[capacity]; // safe cast; compiler warning
	}
	public int siz() {return(  t+1 );}
	public boolean isEmpty(){return (t==-1);}
	public void push(E e) throws IllegalStateException {
		if(size() == data.length) throw new IllegalStateException("Stack is full");
		data[++t] = e;                     // increment t before storing new item
	}
	public E top() {
		if(isEmpty()) return null;
		return data[t];
	}
	public E pop() {
		if(isempty()) return null;
		E answer = data[t];
		data[t] = null;                   // dereference to help garbage collection
		t--;
		return answer;
	}
}