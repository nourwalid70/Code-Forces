import java.util.Scanner;

public class solution4 {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int n = 0,m =0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				arr[i][j] = input.nextInt();
				if(arr[i][j] == 1) {
					 n = i;
					 m = j;
				}
			}
		}
		
		if(n>2 && m>2) {
			int f = (n-2)+(m-2);
			System.out.println(f);		
		}
		else if (n>2 && m<=2) {
			int f = (n-2)+(2-m);
			System.out.println(f);	
		}
		else if (m>2 && n<=2) {
			int f = (m-2)+(2-n);
			System.out.println(f);	
		}
		else { // n<=2 && m<=2
			int f = (2-n)+(2-m);
			System.out.println(f);
		}	
		
	}
}
