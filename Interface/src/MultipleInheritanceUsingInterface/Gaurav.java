package MultipleInheritanceUsingInterface;

public class Gaurav implements inter1,inter2 {

	@Override
	public void div(int x, int y) {
		int c=x/y;
		System.out.println(c);
		
	}

	@Override
	public void mul(int x, int y) {
		// TODO Auto-generated method stub
		int c=x*y;
		System.out.println(c);
		
	}

}
