import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> string1=getAllStairs(n);
		System.out.println(string1);

	}
	
	
	public static ArrayList<String> getAllStairs(int n){
		if(n==0) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}else if(n<0) {
			ArrayList<String> bres=new ArrayList<>();
			return bres;
		}
		ArrayList<String> path1=getAllStairs(n-1);
		ArrayList<String> path2=getAllStairs(n-2);
		ArrayList<String> path3=getAllStairs(n-3);
		
		ArrayList<String> path=new ArrayList<>();
		for(String path4:path1) {
			path.add(1+path4);
		}
		for(String path5:path2) {
			path.add(2+path5);
		}
		for(String path6:path3) {
			path.add(3+path6);
		}
		return path;
		
	}

}
