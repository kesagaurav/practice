
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<60;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
