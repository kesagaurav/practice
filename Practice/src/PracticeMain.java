import java.util.ArrayList;
import java.util.List;

public class PracticeMain {

	public static void main(String[] args) {
		List<Integer> candles=new ArrayList<>();
		candles.add(4);
		candles.add(4);
		candles.add(1);
		candles.add(3);
		//candles.add(0);

			; //.forEach(e->System.out.println(e));
Integer i=	candles.stream().max((a,b)->a.compareTo(b)).get();
System.out.println(i);
		
		
		
		
	}

}
