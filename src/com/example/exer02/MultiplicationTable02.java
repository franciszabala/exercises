
public class MultiplicationTable02 {
		
	public static void main (String []args){
				int array[][]= {{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}};
				int array2[]={1,2,3,4,5,6,7,8,9,10};
				display (array, array2);
						
				}  
				
				public static void display (int x[][], int y[]){
				
				for (int row = 0; row < x.length; row++){
					for (int column = 0; column < x[row].length; column++){
					
						for (int row2 = 0; row2 < x.length; row2++){
						
						
						
						System.out.print((x[row][column])*y[row2] + "\t");
					}
					
					System.out.println();	
					}
				}
		}
		}

