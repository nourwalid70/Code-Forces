import java.util.Scanner;

public class solution9 {
	public static void main(String[] args) {
		
		
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
		
	int n = input.nextInt();
	int count = 1;
	String[] arr = new String[n];	
	
	for(int i=0 ; i<n ; i++) {
		arr[i] = input.next();
	}	
	
	/*for(int j=0 ; j<n ; j++) {
		System.out.println(arr[j]);
	}*/	
	
	for(int i=0 ; i<n ; i++) {
		if(i+1<n) {
		if(!(arr[i].equals(arr[i+1]))) {
			count++;
		}
	}
		}
		
	System.out.println(count);	
	}
}
