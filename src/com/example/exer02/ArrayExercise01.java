package com.example.exer02;

public class ArrayExercise01 {
    
	public static int[] reverse(int[] array) {
		    for(int counter=0; counter<array.length/2; counter++) {
		        int temp = array[counter];                    
		        array[counter] = array[array.length-1-counter];
		        array[array.length-1-counter] = temp;
		    }
		    return array;
		}

		public static void main(String[] args) {
			/** Create an array of integers **/
			
			/** Output them in the order **/
			
			/** Output them in reverse **/
		    int[] array = {2,4,6,8};
		    int[] newArray = reverse(array);
		    for(int counter=0; counter<newArray.length; counter++) {          
		        System.out.print(newArray[counter]+" ");      
		    }

		
		}

		

	}
	

