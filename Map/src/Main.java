import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "gaurav"); // adds or insert
		hm.put(null, null);
		hm.put(1, "gauravupdated");
		hm.put(2,"sapthagiri");
		hm.put(3, "gauravdeepa");
		hm.put(4,"saikumar");
		hm.put(5, "darshan");
		hm.put(6, "arjun");
		hm.put(7, "shiva");
		hm.put(8, "gauraaversion2");
		hm.put(9, "hello");
		System.out.println(hm);

		// Map<Integer,String> tm=new TreeMap<>();
		Map<Integer, String> tm = new TreeMap<>(Collections.reverseOrder());
		tm.put(1, "gauravupdated");
		tm.put(2, "gaurav");
		tm.put(3, "raj");
		tm.put(4, null);
		tm.put(5, null); // so in tree map it can have null values but we cannot have null keys

		System.out.println("tm " + tm);

		System.out.println(" map using iteration ");

		for (int i = 0; i < hm.size(); i++) {

			System.out.println(hm.get(i)); // it will get the key and in this it will give value
			// because in the Map<Inetegr,String> hm=new HashMao<>();
			//	hm.put(null, null);
			//hm.put(1, "gauravupdated");
			// when i was using get(i) it will give us only value because in Map<Integer,String>
			// where Integer="key" and String="value" so it will give null and gauravupdated
		}
		
		
		hm.containsKey(1);
		System.out.println(hm.containsKey(1));
		//"it will conatains only key it will reture true if is there"
	//	+ "outhrewise it will give false "

		
		System.out.println(hm.containsKey(01010));
		
		
		System.out.println("keys " + hm.keySet());
		System.out.println("values " + hm.values());
		
		
		
		
		
		// iteration using keyset in map
		System.out.println("\n iteration using keyset() in java");
		Set<Integer> set=hm.keySet(); // this is the first way of doing the iteration
		for(Integer i:set) {
			System.out.println(" the key  is " + i + " the value is " + hm.get(i) );
		}
		
		
		// the second way of doing iteration is this is preferred one
		System.out.println("\n the second way of doing map iteration is using entryset()");
		for(Entry<Integer, String> gau: hm.entrySet()) {
			System.out.println("keys -> " + gau.getKey() + " values -> " + gau.getValue());
		}
		
		// anthor way of using iteration is
		System.out.println("\n using foreach loop iteration");
		hm.forEach((k,v)->System.out.println(" the key is " + k + " the value is " + v));
		
		
	}

}
