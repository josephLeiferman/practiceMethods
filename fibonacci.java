/** Returns array containing the pair of Fibonacci numbers, F(n) and F(n-1). */
public static long[] fibonacci(int n){
	if (n<=1) {
		long[] answer = {n,0};
		return answer;
	} else {
		long[] temp = fibonacci(n-1);
		long[] answer = {temp[0] + temp[1], temp[0]}; // returns {Fn-1, Fn-1}
		return answer;
	}
}