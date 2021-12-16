import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,2,3,4,5};
		System.out.println(a.length);
		int k=3;
	
			IntStream b=Arrays.stream(a,1,3); //.collect(Collectors.toList());
			b.forEach(str-> System.out.println(str + " "));
			
			for(int i=0;i<k-1;i++) {
				int c[]=Arrays.copyOfRange(a, 1, k);
				System.out.println(Arrays.toString(c));
			}
		
		

	}

}
