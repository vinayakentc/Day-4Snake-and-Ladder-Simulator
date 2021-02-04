package snakeladder;

public class SnakeAndLadderSimulator {

	public static void main(String[] args) 
	{
		//  PLAYER 1 and PLAYER 2
		// Constants
		final int NOPLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		int WINNING_POSITION = 100;
		
		// Variables
		// PLAYER1
		int pos1 = 0;
		int counter1 = 0;
		int winningDicesRolled1 = 0;
		
		// PLAYER2
		int pos2 = 0;
		int counter2 = 0;
		int winningDicesRolled2 = 0;
				
		while ( pos1 != WINNING_POSITION && pos2 != WINNING_POSITION )
		{
		
			// Dice roll
			// PLAYER1
			int roll1 = (int) ( Math.floor( Math.random()*10 ) %6 ) + 1 ;
			
			// PLAYER2
			int roll2 = (int) ( Math.floor( Math.random()*10 ) %6 ) + 1 ;
		
			// Options for Movement
			// PLAYER1 
			int option1 = (int) Math.floor( Math.random()*10 ) %3;
			switch(option1)
				{
					case NOPLAY:
						counter1 = 0;
						break;
					case LADDER:
						counter1 = roll1;
						break;
					case SNAKE:
						counter1 = -roll1;
						break;
				}
			
			// PLAYER2 
			int option2 = (int) Math.floor( Math.random()*10 ) %3;
			switch(option2)
				{
					case NOPLAY:
						counter2 = 0;
						break;
					case LADDER:
						counter2 = roll2;
						break;
					case SNAKE:
						counter2 = -roll2;
						break;
				}
			
			// Movement Calculation
			// PLAYER1
			if ( option1 == LADDER )
			{
				pos1 = pos1 + counter1 + counter1;
			}
			else
			{
				pos1 = pos1 + counter1;
			}
			// PLAYER2
			if ( option2 == LADDER )
			{	
				pos2 = pos2 + counter2 + counter2;
			}
			else
			{
				pos2 = pos2 + counter2;
			}
			// PLAYER1
			// Movement below Start Position 
			if ( pos1 < NOPLAY )
			{
				pos1 = NOPLAY;
			}
			// Movement above Winning Position
			else if ( pos1 > WINNING_POSITION )
			{
				winningDicesRolled1++;
				if( option1 == LADDER ) 
				{
					pos1 = pos1 - counter1 - counter1;
				}
				else
				{
					pos1 = pos1 - counter1;
				}
			}
			
			// PLAYER2
			// Movement below Start Position
			if ( pos2 < NOPLAY )
			{
				pos2 = NOPLAY;
			}
			// Movement above Winning Position
			else if ( pos2 > WINNING_POSITION )
			{
				winningDicesRolled2++;
				if ( option2 == LADDER ) 
				{
					pos2 = pos2 - counter2 - counter2;
				}
				else
				{
					pos2 = pos2 - counter2;
				}
				
			}
				
			System.out.println("After Rolling dice Current position for PLAYER1 is "+pos1);
			System.out.println("After Rolling dice Current position for PLAYER2 is "+pos2);
		}	
		
		System.out.println("Number of times dice was played to win by PLAYER1 "+winningDicesRolled1);
		System.out.println("Number of times dice was played to win by PLAYER2 "+winningDicesRolled2);
		
		if( pos1 == WINNING_POSITION )
		{
			System.out.println("PLAYER1 has won");
		}
		else
		{
			System.out.println("PLAYER2 has won");
		}
	}
}