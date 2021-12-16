import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		D d = new D();
//		d.callGaurav();
//		d.getName1();
//		d.show();
//		d.setName("deepa");
//		d.getName();
//		d.add(3, 4);
		Gaurav.add(3, 3);
		// Gaurav g=new Gaurav();
		// a[i]=a[j];
		// a[
		String s[] = { "gaurav", "satish", "appple", "banananaaaaaaa" };
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].charAt(i)<s[j].charAt(j)) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;

				}
				System.out.println(s[i].compareTo(s[j]));

			}
			//System.out.println(s[i]);


		}
		
//		for(int z=0;z<s.length;z++) {
//			System.out.println(s[z]);
//		}



	}

}
