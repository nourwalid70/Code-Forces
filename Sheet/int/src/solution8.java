import java.util.Scanner;

public class solution8 {
	public static void main(String[] args) {
		
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
		
	String s = input.next();
 	int checkup = 0;	
       		
	for(int i=0 ; i<s.length() ; i++) {
		if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
			checkup++;
		}
	}
	int checkdown = s.length() - checkup;	
	//System.out.println(check);	
		
	if(checkup > checkdown){
		
			s = s.toUpperCase();
			System.out.println(s);
	}
	else if(checkup <= checkdown) {
		s = s.toLowerCase();
		System.out.println(s);	
	}
  }
}
