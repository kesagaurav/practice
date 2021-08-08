
public class MyClass implements inter1 {

	@Override
	public void add(int x, int y) {
		int c=x+y;
		System.out.println(c);
		
	}

	@Override
	public void sub(int x, int y) {
		int c=x-y;
		System.out.println(c);
		
	}
	
	public void mul(int x,int y) {
		int c=x*y;
		System.out.println(c);
	}

}
