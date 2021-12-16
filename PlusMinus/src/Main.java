import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=new ArrayList<>();
		list.add(-4);
		list.add(3);
		list.add(-9);
		list.add(0);
		list.add(4);
		list.add(1);
		int pos = 0;
		int neg = 0;
		int zero = 0;
		int c = 0, p = 0, zero1 = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < 0) {
//				neg++;
//
//			} else if (arr[i] > 0) {
//				pos++;
//
//			} else if (arr[i] == 0) {
//				zero++;
//
//			}
//			System.out.println(" -ve values " + neg / arr.length);
//			System.out.println(" +ve values " + pos / arr.length);
//			System.out.println(" 0 values " + zero1 / arr.length);
		
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>0) {
				pos++;
				System.out.println(pos/list.size());
			}else if(list.get(i)<0) {
				neg++;
				System.out.println(neg/list.size());

			}else {
				zero++;
				System.out.println(zero/list.size());
			}
		}

		}


	}


