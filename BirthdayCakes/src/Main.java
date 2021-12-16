import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> candles = new ArrayList<>();
		candles.add(3);
		candles.add(2);
		candles.add(1);
		candles.add(3);
		
		
		System.out.println(birthdayCakeCandles(candles));
		// 82 49 82 82 41 82 15 63 38 25

	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		int count = 0;
		int max=candles.get(0);
		for (int i = 0; i < candles.size() - 1; i++) {
		
				if (max>candles.get(i)) {
					max=candles.get(i);
					max++;

				
			}
			

		}

		return max;
	}

}
