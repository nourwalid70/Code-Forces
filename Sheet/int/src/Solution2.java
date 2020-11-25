import java.util.Scanner;

public class Solution2 {
	 public static void main(String[] args) {
		 
		 int a,b;
		 int counter=0;
		 
		 @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		 a = input.nextInt();
		 b = input.nextInt();
		 
		 do {
			 a =a*3;
			 b = b*2;
			 counter++;
		 }
		while(a < b || a == b);
			
		 
		 System.out.println(counter);
		  
	 }
}
