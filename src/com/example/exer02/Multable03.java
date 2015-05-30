package com.example.exer02;

import java.util.Scanner;

public class Multable03 {
	public static void main (String []args){
		
		int array[][]= {{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}};
		int array2[]={1,2,3,4,5,6,7,8,9,10};
		display (array, array2);
			
		
		}  
	
		public static void display (int x[][], int y[]){
			Scanner input = new Scanner (System.in);
			System.out.println("enter row: ");
			int i = input.nextInt();
			System.out.println("enter column:  ");
			int j = input.nextInt();
			
			for (int row = 0; row < i; row++){
			for (int column = 0; column < j; column++){
			for (int row2 = 0; row2 < i; row2++){
			for (int column2 =0; column2 <j; column2++){
				
				System.out.print((x[row][column]+1*column2) *y[row2] + "\t");
				
				input.close();
			}
			
			System.out.println();	
			}
			}
			}
}
}
