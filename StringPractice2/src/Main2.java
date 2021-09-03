

public class Main2 {
public static void main(String[] args) {
	String s="76945";
	System.out.println(check(s));
//	int a=Integer.parseInt(s);
//	if(a%11==0) {
//		return true;
//	}else {
//		return false;
//	}
	
	
}

static boolean check(String str)
{
    int n = str.length();
  
    // Compute sum of even and odd digit
    // sums
    int oddDigSum = 0, evenDigSum = 0;
    for (int i=0; i<n; i++)
    {
        // When i is even, position of digit is odd
        if (i%2 == 0)
            oddDigSum += (str.charAt(i)-'0');
        else
            evenDigSum += (str.charAt(i)-'0');
    }
  
    // Check its difference is divisible by 11 or not
    return ((oddDigSum - evenDigSum) % 11 == 0);
}


//		 int sum=0,odd=0,even=0;
//		 
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)%1==0) {
//				odd=s.charAt(i)-'0';
//				sum+=odd;
//				System.out.println(sum);
//			}else if(s.charAt(i)%2==0) {
//				even=s.charAt(i)-'0';
//				sum+=even;
//				System.out.println(sum);
//				
//			}
//			sum=odd-even;
//			if(sum%11==0) {
//				System.out.println("yes it is divisible by 11");
//			}else {
//				System.out.println("no");
//			}
			
			
			
			
		}
	

