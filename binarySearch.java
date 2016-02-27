/**
* Returns true if the target value is found in the indicated portion of the data array.
*This Search only considers the array portion from data[low] to data[high] inclusive
*/
public static boolean binarySearch(int[] data, int target, int low, int high) {

	if (low> high) 
		return false;                                        // interval empty; no match
	else {
		int mid = (low+high)/2;
		if (target == data[mid])
			return true;                                    // found match
		else if (target < data[mid]) 
			return binarySearch(data,target,low,mid-1);     // recur left of middle
		else
			return binarySearch(data,target, mid+1, high);  // recur right of middle
		
		}
	}