import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMain {

	public static void main(String[] args) {

		Set<Integer> set=new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);

		System.out.println(set);
		System.out.println(set.contains(4));
		
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "gaurav");
		map.put(2, "deepa");
		map.put(3, "ksp");
		
		System.out.println(map);
		System.out.println(map.containsValue("gaurav"));
		
		
		for(int i=0;i<map.size();i++) {
			System.out.println(map.get(i));
		}
	}

}
