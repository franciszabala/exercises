package com.example.exer04ans;

import java.util.Random;

public class BlackJackSimulator {
	public static void main (String args[]) {
		/** a user can only have 5 cards **/
		int maximumCardsOnHand = 5;
		
		int[] playersDeck = new int[5];
		int[] dealersDeck = new int[5];
		
		/** source: http://stackoverflow.com/questions/8236125/get-random-integer-in-range-x-y **/
		Random generator = new Random(); 
		
		/** to know if the games is over or not **/
		boolean gameNotYetOver = true;
		
		/** index to be used when iterating over an array of players deck**/
		int index = 0;
		
		/** loops until gameNotYetOver becomes true **/
		while (gameNotYetOver) {

			/** draw cards **/
			playersDeck[index] = generator.nextInt(10) + 1;
			dealersDeck[index] = generator.nextInt(10) + 1;
			
			/** display cards **/
			displayCardsOnHand(playersDeck);
			
			/** time to check the total cards that we have **/
			int currentTotalOnPlayersDeck = 0;
			int currentTotalOnDealersDeck = 0;
			
			/** time to check the total sum of the cards on each users' hand **/
			for (int index2 = 0; index2 < maximumCardsOnHand; index2++) {
				
				currentTotalOnPlayersDeck += playersDeck[index2];				
				currentTotalOnDealersDeck += dealersDeck[index2];
				
				/** if player's sum is more than 21 then the game is over **/
				if (currentTotalOnPlayersDeck <=21) {
					//keep on playing
				} else {
					gameNotYetOver = false;
					System.out.println("currentTotalOnPlayersDeck: " +currentTotalOnPlayersDeck);
					System.out.println("currentTotalOnDealersDeck: " +currentTotalOnDealersDeck);
					break;
				}
				
			}
			
			index++;
		}
		
		
		
	}

	/** just a helper code to display the cards on hand **/
	static void displayCardsOnHand(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" [" + array[i] + "] ");
		}
		
		System.out.println();
		
	}

	
}
