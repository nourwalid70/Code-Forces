import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String Number;
		Number = input.next();
		ArrayList<Integer> arr = new ArrayList<>();
		String s = "";
		String Final = "";
		
		for(int i=0 ; i< Number.length() ; i++ ) {
			
			if(Number.charAt(i) >= 48 && Number.charAt(i) <= 57) {
				 s = s + Number.charAt(i);

			}
			else {
				int x = Integer.parseInt(s);
				arr.add(x);
				s = "";
			}
			
		}
		
		int x = Integer.parseInt(s);
		arr.add(x);
		Collections.sort(arr);
	
		for(int i=0 ; i< arr.size() ; i++) {
			Final = Final  + arr.get(i);
			
			if(i<arr.size()-1) {
				
				Final = Final  +  "+";
			}
		}
		System.out.println(Final);
	}

}
