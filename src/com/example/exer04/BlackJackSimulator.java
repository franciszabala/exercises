package com.example.exer03;
import java.util.Scanner;
import java.util.Random;

import java.util.Scanner;
import java.util.Random;
public class BlackJackSimulator {

	public static void main (String []args){
		Scanner playAns = new Scanner (System.in);
		int [] deck ={1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		 	int Ace = 11;
		  	int oneDeck = deck.length;
		
		 	System.out.println ("you have 500 worth of chips. Place your bet: ");
		 	playAns.nextInt();
		 			 	
		 	int card1 = (int) (Math.random() * oneDeck);
		 	int card2 = (int) (Math.random()* oneDeck);
		 	int card3 = (int) (Math.random ()* oneDeck);
		 	int card4 = (int) (Math.random ()* oneDeck);
		 
		 	int playerCard = deck[card1];  
		 	int playerCard2 = deck [card3];
		 	int playerTotal = playerCard + playerCard2;
		 	int playerTotalAce= Ace + playerCard2;
		 	int playerTotalAce2= Ace +playerCard;
		 
		 if (playerCard == 1 && playerTotal <= 11 )
			 	System.out.println ("your card:  " + Ace +"\t" + playerCard2 + " total:  " + playerTotalAce ); 
		 else if (playerCard2 == 1 && playerTotal <= 11)
			 	System.out.println ("your card:  " + playerCard +"\t" + Ace + " total:  " + playerTotalAce2); 
		 else if (playerCard2 == 1 && playerTotal >10)
		 		System.out.println ("your card:  " + playerCard +"\t" + playerCard2 + " total:  " + playerTotal);
		 else if (playerCard == 1 && playerTotal >10)
			 System.out.println ("your card:  " + playerCard +"\t" + playerCard2 + " total:  " +  playerTotal);
		 else if (playerTotalAce == 21)
			 System.out.println ("your card: " + Ace +  "\t" + playerCard2 + "  total:  21 "  + "  BLACKJACK!  ");
		 else if (playerTotalAce2 == 21)
			 System.out.println ("your card: " + playerCard +  "\t" + Ace + "  total:  21 "  + "  BLACKJACK!  ");
		 else 
			 System.out.println("your card:  " + playerCard +"\t" + playerCard2 + " total:  " +  playerTotal);
								 
			 int dealerCard = deck [card2];
			 int dealerCard2 = deck [card4];
			 int dealerTotal = dealerCard + dealerCard2;
			 int dealerTotalAce= Ace + dealerCard2;
			 int dealerTotalAce2= Ace +dealerCard;
			 
			 if (dealerCard == 1 && dealerTotal <= 11 )
				 	System.out.println ("dealer card:  " + Ace +"\t" + dealerCard2 + " total:  " + dealerTotalAce ); 
			 else if (dealerCard2 == 1 && dealerTotal <= 11)
				 	System.out.println ("dealer card:  " + dealerCard +"\t" + Ace + " total:  " + dealerTotalAce2); 
			 else if (dealerCard2 == 1 && dealerTotal > 10)
			 		System.out.println ("dealer card:  " +dealerCard +"\t" + dealerCard2 + " total:  " + dealerTotal);
			 else if (dealerCard == 1 && dealerTotal > 10)
				 System.out.println ("dealer card:  " + dealerCard +"\t" + dealerCard2 + " total:  " +  dealerTotal);
			 else if (dealerTotalAce == 21)
				 System.out.println ("your card: " + Ace+  "\t" + dealerCard2 + " total:  21 " + "  BLACKJACK!  ");
			 else if (dealerTotalAce2 ==21)
				 System.out.println ("your card: " + dealerCard+  "\t" + Ace + " total:  21 " + "  BLACKJACK!  ");
			 else 
				 System.out.println ("dealer card: " + dealerCard+  "\t" + dealerCard2 + " total:  " + dealerTotal);
			 
			
			if (playerTotal> dealerTotal)
				System.out.println ("You Win!");
			else if (dealerTotal > playerTotal)
				System.out.println ("You lose!");
			else if (playerTotal == dealerTotal)
				System.out.println ("Draw!");
			else if (playerTotal > dealerTotalAce)
				System.out.println ("You Win!");
			else if (dealerTotalAce > playerTotal)
				System.out.println ("You lose!");
			else if (dealerTotalAce > playerTotal)
				System.out.println ("You lose!");
			else if (playerTotal > dealerTotalAce2)
				System.out.println ("You Win!");
			else if (dealerTotalAce2 > playerTotal)
				System.out.println ("You lose!");
			else if (playerTotal == dealerTotalAce2)
				System.out.println ("Draw!");
			
			
			else if (playerTotalAce > dealerTotal)
				System.out.println ("You Win!");
			else if (dealerTotal > playerTotalAce)
				System.out.println ("You lose!");
			else if (playerTotalAce== dealerTotal)
				System.out.println ("Draw!");
			else if (playerTotalAce > dealerTotalAce)
				System.out.println ("You Win!");
			else if (dealerTotalAce > playerTotalAce)
				System.out.println ("You lose!");
			else if (playerTotalAce == dealerTotalAce)
				System.out.println ("Draw!");
			else if (playerTotalAce > dealerTotalAce2)
				System.out.println ("You Win!");
			else if (dealerTotalAce2 > playerTotalAce)
				System.out.println ("You lose!");
			else if (playerTotalAce == dealerTotalAce2)
				System.out.println ("Draw!");
			
			
			else if (playerTotalAce2 > dealerTotal)
				System.out.println ("You Win!");
			else if (dealerTotal > playerTotalAce2)
				System.out.println ("You lose!");
			else if (playerTotalAce2 == dealerTotal)
				System.out.println ("Draw!");
			else if (playerTotalAce2 > dealerTotalAce)
				System.out.println ("You Win!");
			else if (dealerTotalAce > playerTotalAce2)
				System.out.println ("You lose!");
			else if (playerTotalAce2 == dealerTotalAce)
				System.out.println ("Draw!");
			else if (playerTotalAce2 > dealerTotalAce2)
				System.out.println ("You Win!");
			else if (dealerTotalAce2 > playerTotalAce2)
				System.out.println ("You lose!");
			else if (playerTotalAce2 == dealerTotalAce2)
				System.out.println ("Draw!");
			else
				System.out.println (" ");
			
			
			
			
			
}
		 }
		
		
		
	


