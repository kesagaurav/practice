
public class LazyAndEager {

	public static void main(String[] args) {

		
	}
	
	

}




//eager intilization of singleton class

//public class Gaurav{
//	
//private static Gaurav g=new Gaurav();
//
//	private Gaurav(){
//	}
//
//	public static Gaurav getGaurav(){
//	return g;
//}
//
//}

//static using the singleton class and also for exceptional handling as well
//public class Gaurav{
//	
//private static Gaurav g;
//
//	private Gaurav(){
//	}
//
//	static
//{
//	g=new Gaurav();
//}
//
//}

////lazy we can do only the single thread but not the multithread because if we use 
//multithreading it will break the property of the singleton 
//public class Gaurav{
//	
//private static Gaurav g;
//
//	private Gaurav(){
//	}
//
//	public static Gaurav getGaurav(){
//	if(g==null){
//		g=new Gaurav();
//}
//	return g;
//}
//
//}
