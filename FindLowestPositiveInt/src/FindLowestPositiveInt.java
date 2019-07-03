import java.util.HashSet;

public class FindLowestPositiveInt {
	
	public static HashSet<Integer> createSet(int[] arr) {
		HashSet<Integer> set;
		
		// check if array is null 
		// if so then return null
		// if not then initialise set with the size of the array
		if (arr.length == 0 || arr == null) {
			return null;
		} else {
			set = new HashSet<>(arr.length);
		}
		
		// add all elements from array that are >0 to set
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				set.add(arr[i]);
			}
		}
		
		return set;
	}
	
	public static int findLowest(int min, HashSet<Integer> set) {
		// if the min is in set
		// recursively call the function with the min + 1 as a parameter
		// if not then return min
		if (set.contains(min)) {
			return findLowest(min + 1, set);
		} else {
			return min;
		}
	}
	
	// helper method
	public static int findLowest(HashSet<Integer> set) {
		return findLowest(1, set);
	}

	public static void main(String[] args) {
		int[] arr = {-1, 1, 3, 4};
		System.out.println(findLowest(createSet(arr)));
	}
}
