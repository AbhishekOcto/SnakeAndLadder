package com.bridgelabz.snakeNladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println(" ***Welcome to Snake & Ladder Simulation Program*** ");
       
		int position = 0;
		System.out.println("Player1's position: " +position);
		
		int dice = (int)(Math.random()*10)%6 + 1; 
		System.out.println("Dice roll result is: " +dice);
		
		/*UC4
		 * Repeating till Player1 gets 100
		 * */
		
		while (position < 100) {
		
		int option = (int)(Math.random() * 10 ) % 3;
		System.out.println("Option for Player1: "+option);
		switch (option) {
		case 1:
			System.out.println("Ladder");
			position += dice;
			break;
		case 2:
			System.out.println("Snake");
			position -= dice;
			break;
		default:
			System.out.println("No Play");
		}
		if(position<0) {
			position = 0;
		}
		System.out.println("Position of Player1: " + position);
		}
		
	}

}
