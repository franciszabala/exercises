package com.example.exer04ans;

import java.util.Random;

public class BlackJackSimulator02 {
	private static Random rnd = new Random();

	public static void main (String args[]) {
		/** a user can only have 5 cards **/
		int maximumCardsOnHand = 5;
		
		int[] playersDeck = new int[maximumCardsOnHand];
		int[] dealersDeck = new int[maximumCardsOnHand];
		
		/** to know if the games is over or not **/
		boolean gameNotYetOver = true;
		
		/** index to be used when iterating over an array of players deck**/
		int index = 0;
		
		/** loops until gameNotYetOver becomes true **/
		while (gameNotYetOver) {
			
			boolean isGutysEnoughToDrawMoreCards = true;

			/** draw cards **/
			/** source: http://stackoverflow.com/questions/8236125/get-random-integer-in-range-x-y **/ 
			playersDeck[index] = rnd.nextInt(10) + 1;
			dealersDeck[index] = rnd.nextInt(10) + 1;
			
			/** display cards **/
			displayCardsOnHand(playersDeck);
			
			/** time to check the total cards that we have **/
			int currentTotalOnPlayersDeck = 0;
			int currentTotalOnDealersDeck = 0;
			
			
			/** time to check the total sum of the cards on each users' hand **/
			/** for loop refactored and now using a method called getTheSumOfTheDeckOnHand **/
			currentTotalOnPlayersDeck = getTheSumOfTheDeckOnHand(playersDeck);
			currentTotalOnDealersDeck = getTheSumOfTheDeckOnHand(dealersDeck);
			
			/** let's add some logic **/
			
			/** By this logic, the game ends only when player's card is more than 21! **/
			/*
			if (currentTotalOnPlayersDeck > 21) {
				gameNotYetOver = false;
				System.out.println("currentTotalOnPlayersDeck: " +currentTotalOnPlayersDeck);
			}
			*/
			System.out.println("currentTotalOnPlayersDeck: " +currentTotalOnPlayersDeck);
			if (currentTotalOnPlayersDeck <= 21) {
				
				boolean getMoreCards = getRandomBoolean();
				if (!getMoreCards) {
					System.out.println("Plays does not want to get more cards.");
					System.out.println("Total On Players Deck: " +currentTotalOnPlayersDeck);
					System.out.println("Total On Dealers Deck: " +currentTotalOnDealersDeck);
					
					/** player isn't gutsy enough so time to compare with the dealer **/
					if (currentTotalOnPlayersDeck > currentTotalOnDealersDeck) {
						System.out.println("Player wins!");
						gameNotYetOver = false;
					} else {
						System.out.println("Dealer wins!");
						gameNotYetOver = false;
					}
				} 
					
			} else {
				
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
	
	static int getTheSumOfTheDeckOnHand(int[] array) {
		int deckTotal = 0;
		for (int i = 0; i < array.length; i++) {
			deckTotal += array[i];
		}
		return deckTotal;
	}

	
	public static boolean getRandomBoolean() {
	       return rnd.nextBoolean();
	}
}
