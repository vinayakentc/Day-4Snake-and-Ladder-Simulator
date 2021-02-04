package snakeladder;

public class SnakeAndLadderSimulator {

	public static void main(String[] args) 
	{
		//  Player 1 
		// Constants
		
		final int NOPLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		
		// Variables
		
		int pos1 = 0;
		int counter = 0;
		
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
				
		System.out.println("According to option your movement will be "+counter);
		
			
	}
}
