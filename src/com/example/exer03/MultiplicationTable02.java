package com.example.exer03;

/** Always create packages **/

public class MultiplicationTable02 {
	public static void main(String[] args) {
		/** Explain why you used two dimensional array **/
		int array[][] = { { 1 }, { 2 }, { 3 }, { 4 }, { 5 }, { 6 }, { 7 },
				{ 8 }, { 9 }, { 10 } }; 
		int array2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		display(array, array2);
		
		/** a simpler example i guess **/
		int row[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int columns[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		createTable(columns,row);
	}

	public static void display(int x[][], int y[]) {

		for (int row = 0; row < x.length; row++) {
			for (int column = 0; column < x[row].length; column++) {

				for (int row2 = 0; row2 < x.length; row2++) {

					System.out.print((x[row][column]) * y[row2] + "\t");
				}

				System.out.println();
			}
		}
	}
	
	public static void createTable(int x[], int y[]) {
		for (int row = 0; row < x.length; row++) {
			for (int column = 0; column < y.length; column++) {
				System.out.print(x[row] * y[column] + "\t");
			}
			System.out.println();
		}
	}
	
	
}
