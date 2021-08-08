
public class Main {

	
	public static void main(String[] args) {
		A a=new A();
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				a.add();
				
			}
		});

		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				a.cal();
			}
		});
	}
	
	
}
