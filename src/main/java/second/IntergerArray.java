package second;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntergerArray{
	

	public static int[] twoNumberSum(int[] array, int targetSum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for (Integer i : array) {
			if (map.containsKey(targetSum - i)) {
				int[] arr = new int[2];
				arr[0] = i;
				arr[1] = targetSum - i;
				map2.put(arr[0],arr[1]);
			} else {
				map.put(i, i);
			}
		} // Write your code here. return new int[0]; }
		System.out.println(map2);
		return array;
	}
	
	public static void main(String[] args) {
		int[] i = {5,2,3,9,6,1,4,7,8};
		System.out.println(Arrays.toString(twoNumberSum(i,11)));
	}
}