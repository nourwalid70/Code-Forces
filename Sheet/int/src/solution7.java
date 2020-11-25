import java.util.Scanner;

public class solution7 {
	public static void main(String[] args) {
	
	/*String s1 = "wjmzbmr";
	int n = (int) s1.chars().distinct().count();
	System.out.println(n);*/
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String s = input.next();
		
		int n = s.length();
		int c = s.length();
		//System.out.println(c);
		
		char[] chars = s.toCharArray();
	
	for(int i=0 ; i<n-1 ; i++) {
      if(chars[i] != '0') {
		for(int j=i+1 ; j < n ; j++) {
			if(chars[i] == chars[j]) {
				chars[j] = '0';
				c--;
			}
		 } 
	   }
	 }
	
	if(c%2 == 0) { // c => even
		System.out.println("CHAT WITH HER!");
	}else {       // c => odd
		System.out.println("IGNORE HIM!");
	}
  }
}
