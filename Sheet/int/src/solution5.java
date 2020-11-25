import java.util.Scanner;

public class solution5 {
public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	
	   int n = input.nextInt(); // number of columns
		int[] arr = new int[n];
		
		for(int i=0; i<n ; i++) {
			arr[i] = input.nextInt();
		}
	
	        for (int i = 0; i <n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) { 
	                if (arr[i] > arr[j]) 
	                {
	                    arr[i] = arr[i] ^ arr[j];
	                    arr[j] = arr[i] ^ arr[j];
	                    arr[i] = arr[i] ^ arr[j];
	                }
	            }
	        }
		for(int i=0 ; i<n ; i++) {
		System.out.print(arr[i]+" ");	
	  }				
   }
}
