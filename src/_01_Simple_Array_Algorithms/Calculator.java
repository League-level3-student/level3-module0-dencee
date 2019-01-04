package _01_Simple_Array_Algorithms;

public class Calculator {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = new int[10];
		
		for( int i = 0; i < 10; i++) {
			arr[i] = i+1;
		}
		
		arr[6] = 0;
		
		for( int i = 0; i < 10; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum + " " + (55 - sum) );
	}
	
	public int sum( int a, int b) {
		return a+b;
	}
	
	public int subtract( int a, int b) {
		return a-b;
	}
	
	public float sumFloat( float a, float b ) {
		return a+b;
	}

}
