/***************************************
*	file:Decoder
*	class:CS 141 - Programming and Problem Solving
*
*	assignment: program 1
*	date last modified: 1/13/2017
*
*	purpose: This program takes an input from the keyboard, in this case a .txt file, that has an encoded message
*            and then decode it by locating the letter corresponding to the integer location.
****************************************/
import java.util.*;

public class Selva_Decoder
{
	public static void main(String[] args)
	{
		//We use the scanner method from the scanner class that takes any input from the keyboard and stores it in the newely created object called input
		Scanner input = new Scanner (System.in); //all data inputted is stored in the input object
		String letter = input.nextLine(); //we use the new object named letter to take in any characters from input and check if there is another line
		
		//We output the encoded message and the decoded message by calling its object
		System.out.println("Your encoded message is: " + letter); //we call the letter object to display the information entered at keyboard
		System.out.print("Your decoded message is: "); //we output the decoded message
		
		while (input.hasNext()) //initiate boolean loop to check if there is any other token input
		{
		int position = input.nextInt(); //instantiate position variable as int and use the data from input object while taking in only integers
		char output = letter.charAt(position); //stores the position of each integer in the output object
		System.out.print(output); //prints out the character at the position calling the output object
		}
		
		System.out.println("");
	}
}