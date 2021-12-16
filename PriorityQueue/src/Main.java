import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		

		for(int i=0;i<pq.size();i++) {
			System.out.println(pq.add(i));
			break;
		}
	}

}
