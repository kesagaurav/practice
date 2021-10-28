import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> st = new HashSet<Integer>();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		//System.out.println(st.size());
		st.stream().count();
		st.remove(3);
		for (Integer i:st) {
			if(i%2==0) {
				System.out.println("even " + i);
			}else {
				System.out.println( "odd " + i);
			}
			if(st.equals(i)) {
				st.clear();
				System.out.println("\n empty");
			}
			
			
		}

	}

}
