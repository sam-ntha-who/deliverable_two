package coinflip;

import java.util.Scanner;
import java.lang.Math;


public class CoinFlip {
	
	public static void main(String args[]) {
		// heads or tails
		Scanner guess = new Scanner(System.in);
		System.out.println("Guess which will have more: heads or tails?");
		String headsOrTailsGuess = guess.nextLine();
		
		
		// how many times will we flip the coin
		Scanner flips = new Scanner(System.in);
		System.out.println("How many times should we flip the coin?");
		int numberOfFlips = flips.nextInt(); 
	
		
        // actual coin flip - will give an output of either 1 or 2
        int max = 2;
        int min = 1;
        int range = max - min + 1; 
        int headsCount = 0;
        int tailsCount = 0;
        	for (int i = 0; i < numberOfFlips ; i++) {
        		int rand = (int)(Math.random() * range) + min; 
            
        // output number as heads or tails
                int coin = rand;             
              		if (coin == 1) {
                		System.out.println("heads");                  
              		} else {
                		System.out.println("tails");}
                 
        // counting
              	if (coin == 1) {
                      headsCount++;
                } else if (coin == 2) {
                      tailsCount++; }
         }
     
        	// results
        if (headsOrTailsGuess.contains("heads")) { 
	    	 int correctCount = headsCount;
	    	 double x = (((double)(headsCount * 100)/ numberOfFlips));
	    // make it round!
	    	 int percentage = (int) Math.round(x);
	    	 System.out.println("Your guess, heads, came up " + correctCount + " time(s)"); 
	    	 System.out.println("That's " + percentage + "%");    	 
	     } else { 
	    	 int correctCount = tailsCount;
	    	 double x = (((double)(tailsCount * 100)/ numberOfFlips));
	    // make it round!
	    	 int percentage = (int) Math.round(x);
	    	 System.out.println("Your guess, tails, came up " + correctCount + " time(s)");
	    	 System.out.println("That's " + percentage + "%");
	     }
       
  
     }
        
}
						