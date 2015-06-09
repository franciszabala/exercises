package com.example.exer04;

import java.util.Scanner;
import java.util.Random;

public class BlackJackSimulator {
	
	public static void main (String [] args){
			
			int bet=0;
			Scanner input= new Scanner (System.in);
			System.out.println ("your money: 500");
			System.out.println ("place your bet:" );
			bet = input.nextInt();
			
			Random rnd= new Random();
			int card1, card2,card3, card4, card5, card6;
			
			for (int i = 0; i<1; i++){
				card1=1+rnd.nextInt(11);
				card2=1+rnd.nextInt(11);
				card3=1+rnd.nextInt(11);
				card4=1+rnd.nextInt(11);
				card5=1+rnd.nextInt(11);
				card6=1+rnd.nextInt(11);
				
				int playerCard = card1+ card2;
				int dealerCard = card3 + card4;
				int playerCardHit = card1+ card2+ card5;
				int dealerCardHit = card3+ card4+card6;
				
				System.out.println("player card:" + card1 +  " and " + card2 + " = " + playerCard);
				System.out.println("dealer card:" + card3+ " and " + card4 + " = " + dealerCard );
				System.out.println("");
				
			if (playerCard >= 16 && playerCard < 21)
			System.out.println ("Player Card total: " + playerCard);
			else if (playerCard < 16)
			System.out.println("hit "+ card5+ " player card total: " +playerCardHit);
			
			
			if (playerCardHit>dealerCard && playerCardHit < 21|| playerCardHit >dealerCardHit && playerCardHit < 21)
			System.out.println ("you win");
			else if (playerCard>dealerCard && playerCard < 21|| playerCard >dealerCardHit && playerCardHit < 21)
			System.out.println ("you win");
			else if (dealerCardHit > playerCard && dealerCardHit < 21 || dealerCardHit>playerCardHit && dealerCardHit <21)
			System.out.println ("you lose");
			else if (dealerCard > playerCard && dealerCard < 21 || dealerCard>playerCardHit && dealerCard <21)
			System.out.println ("you lose");
			else if (playerCard == 21)
			System.out.println("blackjack!");
			else if (dealerCard == 21)
			System.out.print("blackjack!");
			
		
			
			if (dealerCard >= 16 && dealerCard < 21)
				System.out.println ("Dealer Card total: " + dealerCard);
			else if (dealerCard < 16)
				System.out.println("hit "+ card6+ " Dealer Card total: " +dealerCardHit);
			
				System.out.println("");
			
			if (dealerCardHit == playerCardHit|| dealerCard ==playerCardHit)
				System.out.println("draw");
			else if (playerCard == dealerCardHit)
				System.out.println("draw");
			else if (playerCard >= 22|| playerCardHit >= 22)
				System.out.println ("player is busted");
			else if (dealerCard >= 22 || dealerCardHit >= 22)
				System.out.println("dealer is busted");
			
			
			int newTotal = 0;
			for(int j =0; j< 1;  j++){
			newTotal+=(bet);
			
			}
			int newTotal2 = 0;
			for(int k = 0; k < 2; k++){
			newTotal2+=(bet);
			}
			if (playerCard > dealerCard && playerCard < 22)
				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
			else if (playerCard > dealerCardHit && playerCard < 22) 
				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
			else if (playerCard < dealerCardHit && dealerCardHit >=22)
				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
			else if (playerCard < dealerCard && dealerCard >=22)
				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
			
			else if (playerCardHit > dealerCard && playerCardHit < 22)
				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
			else if (playerCardHit > dealerCardHit && playerCardHit < 22) 
				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
			else if (playerCardHit < dealerCardHit && dealerCardHit >=22)
				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
			else if (playerCardHit < dealerCard && dealerCard >=22)
				System.out.println("your money: "+ (newTotal+ 500)+ " and "+ "dealer's money: " + ((bet- newTotal2) + 500));
			
			
			else if (dealerCard > playerCard && dealerCard < 22)
				System.out.println("your money: "+ (bet-newTotal + 500) + " Dealer's money: " + (newTotal2+500));
			else if (dealerCard > playerCardHit && dealerCard < 22)
				System.out.println("your money: "+ (bet-newTotal+ 500) + " Dealer's money: " + (newTotal2+500));
			else if (dealerCard<playerCardHit && playerCardHit >=22)
				System.out.println("your money: "+ (bet-newTotal + 500) + " Dealer's money: " + (newTotal2+500));
			else if (dealerCard<playerCard && playerCard >=22)
				System.out.println("your money: "+ (bet-newTotal + 500) + " Dealer's money: " + (newTotal2+500));
			
			else if (dealerCardHit > playerCard && dealerCardHit < 22)
				System.out.println("your money: "+ (bet-newTotal + 500) + " Dealer's money: " + (newTotal2+500));
			else if (dealerCardHit > playerCardHit && dealerCardHit < 22)
				System.out.println("your money: "+ (bet-newTotal+ 500) + " Dealer's money: " + (newTotal2+500));
			else if (dealerCardHit<playerCardHit && playerCardHit >=22)
				System.out.println("your money: "+ (bet-newTotal + 500) + " Dealer's money: " + (newTotal2+500));
			else if (dealerCardHit<playerCard && playerCard >=22)
				System.out.println("your money: "+ (bet-newTotal + 500) + " Dealer's money: " + (newTotal2+500));
			
			else if (playerCard==dealerCard||playerCard==dealerCardHit)
				System.out.println ("your money: " + (0 + newTotal+500) + "Dealer's money: " + (0 + newTotal2 +500));
			else if (playerCardHit==dealerCard||playerCardHit == dealerCardHit)
				System.out.println ("your money: " + (0 + newTotal+500) + "Dealer's money: " + (0 + newTotal2 +500));
			
			System.out.println("");
			}	
			
		}
	}
}
