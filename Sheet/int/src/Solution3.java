import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		
		int n; // rows
		int counter=0;
		int finalC =0;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int[][] arr = new int[n][3];
		
		for(int i=0; i<n ; i++) {
				arr[i][0] = input.nextInt();
				arr[i][1] = input.nextInt();
				arr[i][2] = input.nextInt();
	     	}
		
	for(int i=0; i<n; i++) {
		for(int j=0; j<3; j++) {
			if(arr[i][j] == 1) {
				counter++;
			}
		}
	if(counter == 2 || counter == 3) {
		finalC++;
	    }
	counter=0;
	}
		System.out.println(finalC);
	}
}
