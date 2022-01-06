import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

	    int[] input = {1,2,3,4,5};
        permutation(input);
	}

	
	  public static void permutation(int[] input){
	        Arrays.sort(input);
	        permutation(input,new ArrayList<>(),new boolean[input.length]);
	    }
	  
	  
	  public static void permutation(int[] input, ArrayList<Integer> partial, boolean[] used) {
	        if (partial.size() == input.length) {
	            System.out.println(Arrays.toString(partial.toArray()));
	            System.out.println(partial.size());
	            return;
	        }
	        for (int i = 0; i < input.length; i++) {
	            if (!used[i]) /*&& !(i > 0 && input[i] == input[i - 1] && !used[i - 1]))*/ {
	                used[i] = true;
	               System.out.println( " added elements are " + partial.add(input[i]));
	                permutation(input, partial, used);
	                used[i] = false;
	                System.out.println( " removing elements are  " + partial.remove(partial.size() - 1));
	            }
	        }
	    }
}
