package discount;


import java.util.Scanner;
class Discount{
	public static void main(String []args){
			double amount, discount, discountedprice;
			Scanner input = new Scanner (System.in);
			System.out.println("Original Price: ");
			amount = input.nextDouble();
			System.out.println ("discount percent:");
			discount = input.nextDouble();
			discountedprice = (amount)*(discount*0.01);
			System.out.println("Discounted price is  " + discountedprice);
			
			
		
		}	
	}

