package snakeladder;

public class SnakeAndLadderSimulator {

	public static void main(String[] args) 
	{
		//  Player 1 
		
		int pos1 = 0;
		
		// Dice roll
		
		int roll = (int) ( Math.floor( Math.random()*10 ) %6 ) + 1 ;
		System.out.println(roll);
		
		
	}
}
