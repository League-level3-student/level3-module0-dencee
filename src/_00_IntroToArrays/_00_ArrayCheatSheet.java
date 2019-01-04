package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	String[] myStr = new String[5];
	
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		//testArray();
		String defaultString = "hello";
		
		String[] strings = new String[5];
		for( int i=0; i < strings.length; i++ ) {
			strings[i] = defaultString + " " + i;
		}
		
		//2. print the third element in the array
		System.out.println(strings[2]);
		
		//3. set the third element to a different value
		
		
		//4. print the third element again
		
		//5. use a for loop to set all the elements in the array to a string of your choice
		
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for( String eachStr : strings ) {
			System.out.println(eachStr);
		}
		
		//7. make an array of 50 integers

		//8. use a for loop to make every value of the integer array a random number

		//9. without printing the entire array, print only the smallest number on the array

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
	public static boolean testArray() {
		String[] strArray = { "h", "e", "l", "l", "o" };
		for( String s : strArray ) {
			System.out.println(s);
		}
		
		return true;
	}
}
