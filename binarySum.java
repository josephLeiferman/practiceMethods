/** Returns the sum of subarray data[low] trhough data[high] inclusive*/
// do not use this algorithm run time O(n^2)
public static int binarySum(int[] data, int low, int high) {
	if (low> high) 
		return 0;
	else if (low == high) 
		return data[low];
	else {
		int mid = (low + high)/ 2;
		return binarySum(data, low,mid) + binarySum(data, mid+1, high);
	}
	
}