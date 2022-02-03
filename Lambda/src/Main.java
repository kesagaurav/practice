
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add c=(a,b)->{
			return a+b;
		};
		
		System.out.println("addtion is " + c.add(10,20));
		
		Add e=(c1,b)->{
			return c1+b;
		};
		System.out.println(e.add(10, 21));
		
		Multiplication m=(a,b)->{
			return a*b;
		};
		
		System.out.println("product is " + m.multiply(2, 3));
		
		subtraction sb=(a,b)->{
			return a-b;
		};
		
		System.out.println("sub is " + sb.sub(3, 2));
		
		Division d=(x,y)->{
			return x/y;
		};
		
		System.out.println("div is " + d.divide(4, 2));

	}

}
