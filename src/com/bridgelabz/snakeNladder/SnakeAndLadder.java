package com.bridgelabz.snakeNladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println(" ***Welcome to Snake & Ladder Simulation Program*** ");
       
		int position = 0;
		System.out.println("Player1's position: " +position);
		
		/*UC2
		 * Rolling the dice to get a number
		 * */
		
		int dice = (int)(Math.random()*10)%6 + 1; 
		System.out.println("Dice roll result is: " +dice);
	}

}
