import java.util.ArrayList;
import java.util.Scanner;

public class Solution10 {
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
       
		int n = input.nextInt();
		int s = 0;
		int d = 0;
		ArrayList<Integer> arr = new ArrayList<>(n);
		
		for(int i=0; i<n ;i++) {
			arr.add(i,input.nextInt());
		}
		
		for(int j=0;j<n;j++) {
			
			if((arr.get(0) > arr.get(arr.size()-1)) && (j%2 == 0)) {
				s = s + arr.get(0);
				arr.remove(0);
			}
			else if((arr.get(0) < arr.get(arr.size()-1)) && j%2 == 0) {
				s = s + arr.get(arr.size()-1);
				arr.remove(arr.size()-1);
			}
			else if((arr.get(0) > arr.get(arr.size()-1)) && j%2 != 0) {
				d = d + arr.get(0);
				arr.remove(0);
			}
			else if((arr.get(0) < arr.get(arr.size()-1)) && j%2 != 0) {
				d = d + arr.get(arr.size()-1);
				arr.remove(arr.size()-1);
			}	
		}

		if((n-1)%2 == 0) {
			s = s + arr.get(0);
		}else {
			d = d + arr.get(0);
		}
		
		System.out.println(s+" "+d);
	}

}
