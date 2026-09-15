package Demo8;
import java.util.*;
public class SubArray {
	public static int countSubArray(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int sum = 0;
		int count = 0;
		for(int num: arr) {
			sum = sum + num;
			if(map.containsKey(sum - k)) {
				count = count + map.get(sum - k);
			}
			map.put(sum,map.getOrDefault(sum,0) + 1);
		}
		return count;
	}
	public static void main(String[] args) {
		int[] transaction = {1, 1, 1};
		int targetAmount = 2;
		int result = countSubArray(transaction, targetAmount);
		System.out.println(result);

	}

}
