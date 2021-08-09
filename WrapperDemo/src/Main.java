
public class Main {

	public static void main(String[] args) {
		int a=10;
		Integer i=Integer.valueOf(a);
		Integer j=i;
		System.out.println("\n this is for integer wrapper");
		System.out.println(" a is " + a + " i is " + i + " j is " + j);

		// form float to Float
		float f=10.0f;
		Float f1=Float.valueOf(f);
		Float f2=f1;
		System.out.println("\n this is for float wrapper");
		System.out.println(" f is " + f +  "f1 is " + f1 + " f2 is "+ f2);
		
		//double
		double d=20.00;
		Double d1=Double.valueOf(d);
		Double d2=d1;
		System.out.println("\n this is for double wrapper");
		System.out.println(" d is " + d +  "d1 is " + d1 + " d2 is "+ d2);
		
		//long
		long l=3000;
		Long l1=Long.valueOf(l);
		Long l2=l;
		System.out.println("\n this is for long wrapper");
		System.out.println(" l is " + l +  "l1 is " + l1 + " l2 is "+ l2);
		
		//unboxing in java
		Integer c=new Integer(20);
		int e=c;
		System.out.println(e);
		
		
	}

}
