
import java.lang.reflect.Array;
import java.util.Scanner;




public class Solution12 {

	public static void main(String[] args) {
	
  @SuppressWarnings("resource")
Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int k = input.nextInt();
  char[] a = {'b','c','d','e','f','a','g','h','j','q','r','s','t','i','k','u','v','w','l','m','n','o','p','x','y','z'};
  char[] arr = new char[n];
  
  for(int i=0 ; i<k ; i++) {
	  arr[i] = Array.getChar(a, i); // unique 
  }
  int x=0;
  for(int i=k ; i<n ; i++) { // mtkrr
	arr[i] = arr[x++];
  }
  
  String string = new String(arr); // to string
  System.out.println(string);
 
	}
}
