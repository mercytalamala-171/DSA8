package Demo8;
import java.util.*;
public class Anagram1 {
	public static List<List<String>> Anagram1(String[] words) {
		HashMap<String, List<String>> map = new HashMap<>();
		for(String word : words) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String key = new String(chars);
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
		}
		return new ArrayList<>(map.values());
	}
	public static void main(String[] args) {
		String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(Anagram1(words));
	}
}
	