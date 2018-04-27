package com.team2073.app;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		App app = new App();
		for(int i = 0; i < 20; i++) {
			// Normally the run() method will throw an exception and the program will die
			// Modify this to use the ExceptionUtils so the program doesn't die

			// Only modify code below here
			// v v v v v v v v 
			
			app.run();
			
			// ^ ^ ^ ^ ^ ^ ^ ^ 
			// Only modify code above here
		}
		
		app.printWin();
	}
	
	private void run() {
		if(new Random().nextBoolean()) {
			System.out.println("Oh noes! Bad stuff about to happen");
			try { Thread.sleep(10); } catch (InterruptedException e) { }
			throw new IllegalStateException("Some exception happened here.");
		} else {
			System.out.println("You're lucky this time...");
		}
	}
	
	private void printWin() {
		System.out.println("\n\n\n\n");
		System.out.println("==========================================================================================");
		System.out.println("                                 !!!!!!! WINNER !!!!!!!                                   ");
		System.out.println("                                If you see this you won!                                  ");
		System.out.println("==========================================================================================");
		System.out.println("\n\n\n\n");
	}

}
