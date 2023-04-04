package task4.task4;

import java.util.*;

public class KnightMoves {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the position of knight: ");
		int knightRowPosition = obj.nextInt();
		int knightColPosition = obj.nextInt();
		if (knightRowPosition > 0 && knightRowPosition <= 8 && knightColPosition > 0 && knightColPosition <= 8) 
		{
			int possibleWays = noOfPossibleWays(knightRowPosition, knightColPosition);
			System.out.println("possible no.of ways: " + possibleWays);
		} else 
		{
			System.out.println("Give the correct position");
		}
	                                          }

	public static int noOfPossibleWays(int knightRowPosition, int knightColPosition){
		        int count = 0;
		        int row = knightRowPosition, col = knightColPosition;
		        int[] rowPossibility = {row+1, row+1, row+2, row+2, row-1, row-1, row-2, row-2};
		        int[] colPossibility = {col+2, col-2, col-1, col+1, col+2, col-2, col-1, col+1};
		        for(int i=0;i<8;i++)
		        {
		            if(rowPossibility[i]>0&& rowPossibility[i]<=8 && colPossibility[i]>0 && colPossibility[i]<=8)
		            {
		                count++;
		                System.out.println("(" +rowPossibility[i]+ "," +colPossibility[i]+ ")");
		            }
		        }
		        return count;
		    }


        

}
