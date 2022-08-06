package com.bridgelabz.snakeNladder;

public class SnakeAndLadder {
	
	static final int WinningPosition = 100;
	
	public static void main(String[] args) {
		System.out.println(" ***Welcome to Snake & Ladder Simulation Program*** ");
       
		int position = 0;
		int count = 0;
		System.out.println("Player1's position: " +position);
		
		while (position < WinningPosition) {
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
		
		if(position < 0) {
			position = 0;
		}
		else if(position > 100 ) {
			position -= dice;
		}
		
		/*
		 * UC6
		 * Showing the number of times dice rolled and players position
		 * */
		
		count++;
		System.out.println("Position of Player1: " + position);
		}
		System.out.println( "Number of dice rolls: " +count );
	    System.out.println("-->>>Player1 wins after " +count+ " times the dice rolls");
	}

}
