import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		System.out.println("before removing the elements");
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
		
		System.out.println("after removoing the null key values");
		Iterator<Entry<Integer, String>> i = hm.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer, String> e=i.next();
			if(e.getKey()==null) {
				i.remove();
			}
		}
		System.out.println(hm);
		

		Iterator<Entry<Integer, String>> i1 = hm.entrySet().iterator();
		while(i1.hasNext()) {
			Entry<Integer, String> e=i1.next();
			if(e.getKey()%2==0) {
				i1.remove();
			}
			
		}
		
		System.out.println("remove only the even values");
		System.out.println(hm);
		
		
		Iterator<Entry<Integer, String>> i2 = hm.entrySet().iterator();
		int keyTobeChecked=9;
		boolean iskeyPresent=false;
		while(i2.hasNext()) {
			Entry<Integer, String> e=i2.next();
			if(e.getKey()==keyTobeChecked) {
			System.out.println("\n found the key at " + e.getKey() + " and is value is " + e.getValue());
			iskeyPresent=true;
			}
		}
		
		
		System.out.println("found the keys");
		System.out.println(hm);
		System.out.println("Does key "
                + keyTobeChecked
                + " exists: "
                + iskeyPresent);
		
		
		

	}

}
