public class Main {

	public static void main(String[] args) {

		try {
			int[] a = { 1, 2, 3, 4, 5, 6 };
			for (int i = 0; i <= a.length; i++) {
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" array index out of bounds  " + e.getMessage());
		} finally {
			System.out.println("\n hi i am in finally block");
		}

//		List<Integer> li=new ArrayList<>();
//		li.add(4);
//		li.add(1);
//		li.add(5);
//		System.out.println("\n before the collection sort");
//		System.out.println(li);
//		Collections.sort(li);
//		System.out.println("\n after the collection sort");
//		System.out.println(li);
//		System.out.println("\n the collection in desending order is");
//		Collections.sort(li,Collections.reverseOrder());
//		System.out.println(li);

	}

}
