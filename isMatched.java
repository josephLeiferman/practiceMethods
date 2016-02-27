/** the method is matched tests if delimiters in the given expresson are properly
 * matcher. 
 * @author Joseph
 */
public static boolean isMatched(String expression) {
	final String opening = "({[";   // opening delimiters
	final String closing = ")}]";   // respective closing delimters
	Stack<Character> buffer = new LinkedStack<>();
	for (char c: expression.toCharArray()) {
		if (opening.indexOf(c) != -1)       // this is the left delimiter
			buffer.push(c);
		else if (closing.indexOf(c) != -1) {  // this is the right delimiter
			if (buffer.isEmpty())           // nothing to match with
				return false;
			if (closing.indexOf(c) != opening.indexOf(buffer.pop()))
				return false;               // mismatched delimiter
		
		}
	}
	return buffer.isEmpty();                // were all opening delimiters matched?
}