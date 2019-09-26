/*
 * A package that calculates fractions, and integers.
 * @author McKlyde Lagnada
 * @version 0.0.1
 */

package fracCalc;

import java.util.Scanner;

public class FracCalc
{
	public static void main(String[] args)
	{
		// TODO: Read the input from the user and call produceAnswer
		// with that input, printing the result
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		System.out.println(word);
		System.out.println(produceAnswer(word));
		
	}

	// ** IMPORTANT ** DO NOT DELETE THIS METHOD.
	// ** IMPORTANT ** DO NOT CHANGE THE SIGNATURE OF THIS METHOD.
	// 
	// This method will be used to test your code.  It takes a String parameter
	// and RETURNS (not prints) the result
	//
	// Parameter is a fraction string that needs to be evaluated.  For your program, this will be
	// the user input obtained by main.
	//      e.g. input ==> "1/2 + 3/4"
	//        
	// The method should return the result of the fraction after it has been calculated
	//      e.g. return ==> "1_1/4"
	public static String produceAnswer(String input)
	{
		// TODO: Implement this method to produce and return the solution to the input
		int val1 = Integer.parseInt(input.substring(0,1));
		int val2 = Integer.parseInt(input.substring(2,3));
		int total = substr + substr1;
		return ""+ total;
	}
	
	
	// TODO: Fill in the space below with any helper methods that you think you will need

}
