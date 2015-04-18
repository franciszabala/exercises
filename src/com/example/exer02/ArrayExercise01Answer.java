package com.example.exer02;


public class ArrayExercise01Answer {

	public static int[] reverse(int[] array) {
		for (int counter = 0; counter < array.length / 2; counter++) {
			int temp = array[counter];
			array[counter] = array[array.length - 1 - counter];
			array[array.length - 1 - counter] = temp;
		}
		return array;
	}

	public static void main(String[] args) {
		/** Always put the comments in the correct location **/
		
		/** Create an array of integers **/
		int[] array = { 2, 4, 6, 8 };
		
		/** Output them in the order **/
		//you forgot to add this functionality
		for (int counter = 0; counter < array.length; counter++) {
			System.out.print(array[counter] + " ");
		}
		
		System.out.println();
		
		/** Output them in reverse **/
		int[] newArray = reverse(array);
		for (int counter = 0; counter < newArray.length; counter++) {
			System.out.print(newArray[counter] + " ");
		}
	}
}
