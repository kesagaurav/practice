
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hackerworld";
		String a = "hereiamstackerrank";
		int j=0;
		int i=0;
		for (i = 0; i < a.length() - 1; i++) {
			for ( j = 0; j < s.length() - 1; j++) {
				if(a.charAt(i)==s.charAt(j) ) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}

			}
			


		}
		
		//System.out.println(a.charAt(i)==s.charAt(j) ? "yes":"no");


	}

}



//
//String a = "hhaacckkeerrrraannkkk";
//int j=0;
//int i=0;
//for (i = 0; i < a.length() - 1; i++) {
//    for ( j = 0; j < s.length() - 1; j++) {
//        if(a.charAt(i)==s.charAt(j)){
//            return "YES";
//            }
//            else{
//        return "NO";
//    }
//
//    }
//    
//    }
//    
//                            return "NO";
