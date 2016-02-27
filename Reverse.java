/** A generic method for reversing an arry. 
 * @author Joseph
 */
public static <E> void reverse(E[] a) {
	Stack<E> buffer = new ArrayStack <>(a.length);
	for (int i=0; i<a.length; i++)
		buffer.push(a[i]);
	for (int i=0; i<a.legnth; i++)
		a[i] = buffer.pop();
}