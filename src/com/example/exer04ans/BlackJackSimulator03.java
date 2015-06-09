package com.example.exer04ans;

import java.util.Random;

public class BlackJackSimulator03 {
	private static Random rnd = new Random();
	/** a user can only have 5 cards **/
	/** moved it here so that other codes can access this **/
	private static int maximumCardsOnHand = 5;

	public static void main (String args[]) {
		
		
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
				
				/** Force the player to get more cards if he only has one **/
				if (checkHowManyCardsReceived(playersDeck) < 2) {
					getMoreCards = true;
				}
				
				/** Well, if you get a deck of with less than 12, you should be get more cards! **/
				/** This is just random, you could set a minimum to 15 **/
				if (currentTotalOnPlayersDeck <= 14) {
					getMoreCards = true;
				}
				
				/** Well, if you get a deck of with a total of 17, think twice! **/
				if (currentTotalOnPlayersDeck >= 17) {
					getMoreCards = getRandomBoolean() && getRandomBoolean();
				}
				
				
				if (!getMoreCards) {
					System.out.println("Plays does not want to get more cards.");
					System.out.println("Total On Players Deck: " +currentTotalOnPlayersDeck);
					System.out.println("Total On Dealers Deck: " +currentTotalOnDealersDeck);
					
					/** player isn't gutsy enough so time to compare with the dealer **/
					if (currentTotalOnPlayersDeck > currentTotalOnDealersDeck) {
						System.out.println("Player wins!");
						gameNotYetOver = false;
					} else if (currentTotalOnPlayersDeck == currentTotalOnDealersDeck){
						System.out.println("Draw!");
						gameNotYetOver = false;
					} else {
						System.out.println("Dealer wins!");
						gameNotYetOver = false;
					}
				} 
					
			} else {
				gameNotYetOver = false;
				System.out.println("Total On Players Deck: " +currentTotalOnPlayersDeck);
				System.out.println("Dealer wins!");
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
			/** Let's add logic when ace is 1 or 11 **/
			int card = array[i];
			if (deckTotal < 20 && card == 1) {
				card = 11;
			}
			deckTotal += card;
		}
		return deckTotal;
	}

	/** checks how many cards received **/
	/** if there are more than 4 zeros, then the player only got one card **/
	static int checkHowManyCardsReceived(int[] array) {
		int counter = maximumCardsOnHand;
		for (int i = 0; i < array.length; i++) {
			if (array[i] ==0) {
				counter--;
			}
		}
		return counter;
	}
	
	public static boolean getRandomBoolean() {
	       return rnd.nextBoolean();
	}
}
