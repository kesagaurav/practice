
public class Main {

	public static void main(String[] args) throws Exception {

		B b = new B();
		b.getClass();
		b.show();
		D d = new D();
		d.show2();
		// a.new C().show1();
		A.C obj = new A.C();
		obj.show1();
		
		A.Deepa.showGaurav(); // no need to do it because it is used in an static for static there is no creation of object

	}

}
