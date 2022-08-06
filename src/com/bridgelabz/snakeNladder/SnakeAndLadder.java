package com.bridgelabz.snakeNladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println(" ***Welcome to Snake & Ladder Simulation Program*** ");
       
		int position = 0;
		System.out.println("Player1's position: " +position);
		
		while (position < 100) {
		int dice = (int)(Math.random()*10)%6 + 1; 
		System.out.println("Dice roll result is: " +dice);
		           
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
		
		/*UC5
		 * Ensure exact winning position of 100
		 * */
		
		if(position < 0) {
			position = 0;
		}
		else if(position > 100 ) {
			position -= dice;
		}
		System.out.println("Position of Player1: " + position);
		}
		
	}

}
