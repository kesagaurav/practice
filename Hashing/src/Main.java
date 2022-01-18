import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	int bucket;
	ArrayList<LinkedList<Integer>> table;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public void myHash(int b) {
	bucket=b;
	table=new ArrayList<LinkedList<Integer>>();
	for(int i=0;i<b;i++) {
		table.add(new LinkedList<>());
	}
	}
	
	public void insert(int key) {
		
		int i=key%bucket;
		table.get(i).add(key);
	}
	
	public void delete(int key) {
		int i=key%bucket;
		table.get(i).remove((Integer)i);
	}
	
	public boolean search(int key) {
		int i=key%bucket;
		
		return table.get(i).contains(key);
	}
		
	

}
