import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapMain {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "gauravupdated");
		hm.put(2,"sapthagiri");
		hm.put(3, "gauravdeepa");
		hm.put(4,"saikumar");
		hm.put(5, "darshan");
		hm.put(6, "arjun");
		hm.put(7, "shiva");
		hm.put(8, "gauraaversion2");
		hm.put(9, "hello");
		hm.put(10,"ForGeeks");
		hm.put(11, null);
		hm.put(12, "deepa");
		hm.put(13,null);
		hm.put(14, "deepa");
		System.out.println(hm);
		
		System.out.println("after removoing value");
		Iterator<Entry<Integer, String>> i = hm.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer, String> e=i.next();
			if(e.getValue()=="ForGeeks") {
				i.remove();
			}
		}
		System.out.println(hm);
		
		
		// replace null with default
		System.out.println("\n this example is replaceing null with defaults values");
		
		Iterator<Entry<Integer, String>> i1 = hm.entrySet().iterator();
		while(i1.hasNext()) {
			Entry<Integer, String> e=i1.next();
			String e1=e.getValue()==null?e.setValue("z"):"no value has found";
	
		}
		System.out.println(hm);
		
		
		
		
		
		
	}

}
