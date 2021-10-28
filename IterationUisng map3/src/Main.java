import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";

		// Rearrange the sentence based on the words with lowest length first followed
		// by the rest
		// if 2 or more words have same length then arrange them alphabetically first
		
		System.out.println(sortSentenceBasedOnLengthOfWord(s));

	}

	public static String sortSentenceBasedOnLengthOfWord(String s) {
		
		Map<Integer, String> map = new TreeMap<>();
		String ar[] = s.split(" ");
		Arrays.sort(ar);
		for (String w : ar) {
			int length=w.length();
			if(map.containsKey(length)) {
				String temp=map.get(length);
				temp=temp+" "+w;
				map.put(length, temp);
			}else {
				map.put(length, w);
			}
		}
		System.out.println("map : "+map);
		StringBuilder sb=new StringBuilder();
		for(Entry<Integer, String> e:map.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
		return sb.toString().trim();
	}

}
