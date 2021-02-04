package snakeladder;

public class SnakeAndLadderSimulator {

	public static void main(String[] args) 
	{
		//  Player 1 
		// Constants
		final int NOPLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		int WINNING_POSITION = 100;
		
		// Variables
		int pos1 = 0;
		int counter = 0;
		int winningDicesRolled =0;
				
		while ( pos1 != WINNING_POSITION )
		{
		
			// Dice roll
			int roll = (int) ( Math.floor( Math.random()*10 ) %6 ) + 1 ;
		
			// Options for Movement
			int option = (int) Math.floor( Math.random()*10 ) %3;
			switch(option)
				{
					case NOPLAY:
						counter = 0;
						break;
					case LADDER:
						counter = roll;
						break;
					case SNAKE:
						counter = -roll;
						break;
				}
			
			// Movement Calculation
			pos1 = pos1 + counter;
		
			// Movement below Start Position
			if ( pos1 < NOPLAY )
			{
				pos1 = NOPLAY;
			}
			
			// Movement above Winning Position
			else if ( pos1 > WINNING_POSITION )
			{
				winningDicesRolled++;
				pos1 = pos1 - counter;
			}	
			System.out.println("After Rolling dice your Current position is "+pos1);
		}	
	System.out.println("Player 1 has won by reaching the winning position "+pos1);
	System.out.println("Number of times dices was played to win the game is "+winningDicesRolled);
	}
}