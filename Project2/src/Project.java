public class Project {
	public static int binarySearch(Comparable[] objArray, Comparable searchObj) {
		if (objArray.length < 1)
			return 0;
		int low = 0;
		int high = objArray.length - 1;
		int mid = 0;
		if (objArray[0].compareTo(searchObj) > 0)  //If the search object is less than the first element
			return low;
		else if (objArray[objArray.length - 1].compareTo(searchObj) < 0) //If the search object is greater than the last element
			return high + 1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (objArray[mid].compareTo(searchObj) < 0)
				low = mid + 1;
			else if (objArray[mid].	compareTo(searchObj) > 0)
				high = mid - 1;
			else
				return mid;
		}
		return low;
	}
	public static void main(String[] args) {
		Integer[] a = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
		System.out.println("Test case #1: " + binarySearch(a, 1));
		System.out.println("Test case #2: " + binarySearch(a, 30));
		System.out.println("Test case #3: " + binarySearch(a, 12));
		System.out.println("Test case #4: " + binarySearch(a, 3));
		System.out.println("Test case #5: " + binarySearch(a, 21));
		System.out.println("Test case #6: " + binarySearch(a, 11));
		Integer[] b = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
		System.out.println("Test case #7: " + binarySearch(b, 1));
		System.out.println("Test case #8: " + binarySearch(b, 30));
		System.out.println("Test case #9: " + binarySearch(b, 12));
		System.out.println("Test case #10: " + binarySearch(b, 3));
		System.out.println("Test case #11: " + binarySearch(b, 23));
		System.out.println("Test case #12: " + binarySearch(b, 11));
		Integer[] c = {};
		System.out.println("Test case #13: " + binarySearch(c, 11));

	}
}