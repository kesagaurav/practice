
public class Main {

	public static void main(String[] args) {

		D d=new E();
		d.show();
		d.Gaurav();
		// it will cause an erro because i did not create an D object
		E e=(E) new D();
		e.Gaurav();
		e.show();
		e.ok();
		
		E e1=new E();
	
		
		D d1=new D();
		Object o=d1;
		System.out.println(o.getClass());
		o.toString();
	
		// the E access the object,D
		E e2=(E) o;
		e2.Gaurav();
		e2.toString();
		e2.deepa();
	
	
		
	}

}
