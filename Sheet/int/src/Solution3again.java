import java.util.Scanner;

public class Solution3again {
public static void main(String[] args) {
		
		int n; 
		int counter=0;
		int a,b,c;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		for(int i=0; i<n ; i++) {
				a= input.nextInt();
				b= input.nextInt();
				c= input.nextInt();
				if(a+b+c > 1) {
					counter++;
				}
	     	}
	System.out.println(counter);	
  }
}
