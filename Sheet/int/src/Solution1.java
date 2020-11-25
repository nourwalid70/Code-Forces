import java.util.Scanner;

public class Solution1 {
	  public static void main(String[] args) {
		  
		  int n;
		  String s = new String();
		  int a = 0;
		  int d = 0;
		  
		  @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		  n=input.nextInt();
		  s=input.next();
 
		  for(int i=0 ; i<n ; i++) {
			  if(s.charAt(i) == 'A') {
				  a++;
			  }
			  else if(s.charAt(i) == 'D') {
				  d++;
			  }
		  }
		
		if(a > d) {
			System.out.println("Anton");
		}
		else if (d > a) {
			System.out.println("Danik");
		}
		else {
			System.out.println("Friendship");
		}
	  }
}
