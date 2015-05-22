package com.example.exer02;

import java.util.Scanner;

public class ArrayExercise02answer {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int table[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("multiplication table:  ");
		int temp = num.nextInt();

		for (int counter = 0; counter < table.length; counter++) {
			int answer = table[counter] * temp;

		}

		for (int counter2 = 0; counter2 < table.length; counter2++) {
			int answer = table[counter2] * temp;

			System.out.println(table[counter2] + "x" + temp + "=" + answer);

		}

	}
}
