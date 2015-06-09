package com.example.exer04;

import java.util.Scanner;
import java.util.Random;

public class BlackJackSimulator03Updated {
	
	public static void main (String [] args){
			
			int bet=0;
			int playerWallet = 500;
			int dealersWallet = 500;
			Scanner input= new Scanner (System.in);
			System.out.println ("your money: 500");
			System.out.println ("place your bet:" );
			bet = input.nextInt();
			
			Random rnd= new Random();
			int card1, card2,card3, card4, card5, card6;
			int[] playerCards = new int[3];
			int[] dealerCards = new int[3];
			
			int playerCardsTotal = 0;
			int dealerCardsTotal = 0;
			
			
			/** what's the point using a loop if you are going to loop once? **/
			for (int i = 0; i<1; i++){
				/** why not array instead? **/
				/** a player can have a maximum of 5 cards **/
				
				card1=1+rnd.nextInt(11);
				card2=1+rnd.nextInt(11);
				card3=1+rnd.nextInt(11);
				card4=1+rnd.nextInt(11);
				card5=1+rnd.nextInt(11);
				card6=1+rnd.nextInt(11);
				
				int player2Card = card1+ card2;
				int dealer2Card = card3 + card4;
				int player3CardTotal = card1+ card2+ card5;
				int dealer3CardTotal = card3+ card4+card6;
				
				playerCards[0] = card1;
				playerCards[1] = card2;
				playerCards[2] = card5;
				
				dealerCards[0] = card3;
				dealerCards[1] = card4;
				dealerCards[2] = card6;
				
				System.out.println("player card:" + card1 +  " and " + card2 + " = " + player2Card);
				System.out.println("dealer card:" + card3+ " and " + card4 + " = " + dealer2Card );
				System.out.println("");
				
				
			/** I guess this is to show that if the sum of the cards is less than 16, then get another card **/
			if (player2Card >= 16 && player2Card < 21) 
			{ /** Please practice adding curly braces **/
				System.out.println ("Player Card total: " + player2Card);
			} /** Please practice adding curly braces **/
			else if (player2Card < 16) 
			{/** Please practice adding curly braces **/
				/**this is another card **/
				System.out.println("hit "+ card5+ " player card total: " +player3CardTotal);
			}/** Please practice adding curly braces **/
			
			
			/** ok, let deal first with totals **/
			playerCardsTotal = getTheSumOfTheDeckOnHand(playerCards, 2);
			if (playerCardsTotal < 16) {
				playerCardsTotal = getTheSumOfTheDeckOnHand(playerCards, 3);
			}
			
			dealerCardsTotal = getTheSumOfTheDeckOnHand(dealerCards, 2);
			if (dealerCardsTotal < 16) {
				dealerCardsTotal = getTheSumOfTheDeckOnHand(dealerCards, 3);
			}
			
			
			/** this will break in case you add another card **/
			
//			if (player3CardTotal>dealer2Card && player3CardTotal < 21|| player3CardTotal >dealer3CardTotal && player3CardTotal < 21)
//			System.out.println ("you win");
//			else if (player2Card>dealer2Card && player2Card < 21|| player2Card >dealer3CardTotal && player3CardTotal < 21)
//			System.out.println ("you win");
//			else if (dealer3CardTotal > player2Card && dealer3CardTotal < 21 || dealer3CardTotal>player3CardTotal && dealer3CardTotal <21)
//			System.out.println ("you lose");
//			else if (dealer2Card > player2Card && dealer2Card < 21 || dealer2Card>player3CardTotal && dealer2Card <21)
//			System.out.println ("you lose");
//			else if (player2Card == 21)
//			System.out.println("blackjack!");
//			else if (dealer2Card == 21)
//			System.out.print("blackjack!");
			
			if (playerCardsTotal > 21) {
				System.out.println ("player busted");
				playerWallet -= bet;
				dealersWallet += bet;
			} else {
				if (dealerCardsTotal > 21) {
					System.out.println("dealer is busted");
					playerWallet += bet;
					dealersWallet -= bet;
				} else {
					if (playerCardsTotal > dealerCardsTotal) {
						System.out.println ("you win");
						playerWallet += bet;
						dealersWallet -= bet;
					} else if (playerCardsTotal == dealerCardsTotal) {
						System.out.println ("draw");
					} else {
						System.out.println ("you lose");
						playerWallet -= bet;
						dealersWallet += bet;
					}
				}
			}
			
			System.out.println("your money: "+ (playerWallet)+ " and "+ "dealer's money: " + dealersWallet);
			
			/** code that gets a card in case the dealer's card has a sum of less than 16 **/
//			if (dealer2Card >= 16 && dealer2Card < 21)
//				System.out.println ("Dealer Card total: " + dealer2Card);
//			else if (dealer2Card < 16)
//				System.out.println("hit "+ card6+ " Dealer Card total: " +dealer3CardTotal);
			

				System.out.println("");
			
//			if (dealer3CardTotal == player3CardTotal|| dealer2Card ==player3CardTotal)
//				System.out.println("draw");
//			else if (player2Card == dealer3CardTotal)
//				System.out.println("draw");
//			else if (player2Card >= 22|| player3CardTotal >= 22)
//				System.out.println ("player is busted");
//			else if (dealer2Card >= 22 || dealer3CardTotal >= 22)
//				System.out.println("dealer is busted");
			
/*			
			int newTotal = 0;
			for(int j =0; j< 1;  j++){
			newTotal+=(bet);
			
			}
			int newTotal2 = 0;
			for(int k = 0; k < 2; k++){
			newTotal2+=(bet);
			}
*/			
			/** can be achived with the if else statement above **/
//			if (player2Card > dealer2Card && player2Card < 22)
//				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
//			else if (player2Card > dealer3CardTotal && player2Card < 22) 
//				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
//			else if (player2Card < dealer3CardTotal && dealer3CardTotal >=22)
//				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
//			else if (player2Card < dealer2Card && dealer2Card >=22)
//				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
//			
//			else if (player3CardTotal > dealer2Card && player3CardTotal < 22)
//				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
//			else if (player3CardTotal > dealer3CardTotal && player3CardTotal < 22) 
//				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
//			else if (player3CardTotal < dealer3CardTotal && dealer3CardTotal >=22)
//				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
//			else if (player3CardTotal < dealer2Card && dealer2Card >=22)
//				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
//			
//			
//			else if (dealer2Card > player2Card && dealer2Card < 22)
//				System.out.println("your money: "+ (bet-newTotal + 500) + " Dealer's money: " + (newTotal2+500));
//			else if (dealer2Card > player3CardTotal && dealer2Card < 22)
//				System.out.println("your money: "+ (bet-newTotal+ 500) + " Dealer's money: " + (newTotal2+500));
//			else if (dealer2Card<player3CardTotal && player3CardTotal >=22)
//				System.out.println("your money: "+ (bet-newTotal + 500) + " Dealer's money: " + (newTotal2+500));
//			else if (dealer2Card<player2Card && player2Card >=22)
//				System.out.println("your money: "+ (bet-newTotal + 500) + " Dealer's money: " + (newTotal2+500));
//			
//			else if (dealer3CardTotal > player2Card && dealer3CardTotal < 22)
//				System.out.println("your money: "+ (bet-newTotal + 500) + " Dealer's money: " + (newTotal2+500));
//			else if (dealer3CardTotal > player3CardTotal && dealer3CardTotal < 22)
//				System.out.println("your money: "+ (bet-newTotal+ 500) + " Dealer's money: " + (newTotal2+500));
//			else if (dealer3CardTotal<player3CardTotal && player3CardTotal >=22)
//				System.out.println("your money: "+ (bet-newTotal + 500) + " Dealer's money: " + (newTotal2+500));
//			else if (dealer3CardTotal<player2Card && player2Card >=22)
//				System.out.println("your money: "+ (bet-newTotal + 500) + " Dealer's money: " + (newTotal2+500));
//			
//			else if (player2Card==dealer2Card||player2Card==dealer3CardTotal)
//				System.out.println ("your money: " + (0 + newTotal+500) + "Dealer's money: " + (0 + newTotal2 +500));
//			else if (player3CardTotal==dealer2Card||player3CardTotal == dealer3CardTotal)
//				System.out.println ("your money: " + (0 + newTotal+500) + "Dealer's money: " + (0 + newTotal2 +500));
			System.out.println("");
			}	//end of loop
			
			input.close(); 
			
	} //end of public static void main method
	
	/** nakita ko sa notes mo na meron ka ng tuna extends fish, 
	 I assumed that you know how to make methods **/
	/** length = number of cards you want to compute. **/
	static int getTheSumOfTheDeckOnHand(int[] array, int length) {
		int deckTotal = 0;
		
		/** for testing purposes only **/
		if (length == 0) {
			length = array.length;
		}
		
		
		for (int i = 0; i < length; i++) {
			/** Let's add logic when ace is 1 or 11 **/
			int card = array[i];
			if (deckTotal < 20 && card == 1) {
				card = 11;
			}
			deckTotal += card;
		}
		return deckTotal;
	}
}  //end of class
