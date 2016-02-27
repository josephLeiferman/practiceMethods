/** Reverses the contents of subarray data[low] through data[high] inclusive*/
public static void reverseArray(int[] data, int low, int high) {
	if (low < high) {
		int temp = data[low];
		data[low] = data[high];
		data[high] = temp;
		reverseArray(data,low+1,high-1);	
	}
}