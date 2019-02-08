package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		arrTest();
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public void arrayPrint( String[] strArr ) {
		for( String s : strArr ) {
			System.out.println(s);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public void arrayPrintRev( String[] strArr ) {
		for( int i=strArr.length; i >= 0; i-- ) {
			System.out.println(s);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void arrTest() {
		int[] ia = {1,2,3,4,5};
		
		int t = ia[ia.length-1];
		for(int i = ia.length-2; i >= 0; i--) {
			ia[i+1] = ia[i];
		}
		ia[0] = t;
		
		for(int i = 0; i<ia.length; i++) {
			System.out.println(ia[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.

}
