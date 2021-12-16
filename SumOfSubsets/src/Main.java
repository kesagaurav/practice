import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(2);
		ar.add(3);
		int sum=0;
		ArrayList<Integer> ar1=subSets(ar, 0,0);
		System.out.println(ar1);
		

	}
	
	public static ArrayList<Integer> subSets(ArrayList<Integer> arr,int N,int sum){
	
		if(N==0) {
			return arr;
		}
		ArrayList<Integer> a=subSets(arr, N+1,sum+arr.get(N));
		subSets(arr, N,sum+arr.get(0));
		System.out.println(a);
		
		return a;
		
		
	}

}
