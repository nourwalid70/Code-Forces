import java.util.Scanner;

public class solution6 {
	public static void main(String[] args) {
		
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);	
		
	String s1 = input.next();
	String s2 = input.next();
	
	s1 = s1.toLowerCase();
	s2 = s2.toLowerCase();
	
	int n = s1.length();
	boolean x = false;
		
	for(int i=0 ; i<n ; i++) {
		if(s1.charAt(i) > s2.charAt(i)) {
			System.out.println("1");
			x = true;
			break;
		}
		else if(s1.charAt(i) < s2.charAt(i)) {
			System.out.println("-1");
			x = true;
			break;
		}	
	}
		
	if(x == false) {
		System.out.println("0");
	    }
			
	}
}
