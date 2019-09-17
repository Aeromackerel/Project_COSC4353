package editorP;

import java.awt.Font;

public class documentParser 
{
	// Parent Function
	/*
	 * We're recieving the entire document string into this function.
	 */
	
	public void parseAndDetermine(String sourceStringIn)
	{
		
		System.out.println(sourceStringIn);
		
		int counter = 1;
		
		// splits by newline characters
		
		String [] parsedWordsArray = sourceStringIn.split("\\r?\\n");
		
		// Here we want to iterate through the parsed array and determine the type and if it is eligible for font changing
		
		for (String s : parsedWordsArray)
		{
			
			if (s.indexOf("if") > -1 || s.indexOf("else if") > -1 || s.indexOf("for") > -1 || s.indexOf("while") > -1)
			{
				System.out.println("found on line : " + counter);
				System.out.println("Bool operator found - blue operators");
				
				checkValidBoolean(s);
				
			}
			
			if (s.indexOf('+') > -1 || s.indexOf('-') > -1 || s.indexOf('/') > -1 || s.indexOf("||") > -1)
			{
				System.out.println("found on line : " + counter);
				System.out.println("Arithmetic operator found - red operators");
			}
			
			counter++;
		}
		
	}
	
	/*
	 * We need to check if the boolean(s) are
	 * correctly spaced in order to change the font color
	 * of the text-editor
	 * 
	 * We do this by splitting the String line by whitespaces
	 * and iterating through each word and setting it to the correct color
	 * 
	 * NOTE : \\s+ means parse ANY length of white space
	 * 
	 * Font colorFont = new Font("sans-serif", Font.PLAIN, 25);
	 * Color.BLUE Color.RED
	 */
	
	
	private void checkValidBoolean(String stringArrayPiece)
	{
		String [] tempArray = stringArrayPiece.split("\\s+");
		
		int counter = 1;
		
		for (int i = 0; i < tempArray.length; ++i)
		{
			System.out.println(counter);
			
			if (tempArray[i].equals("else"))
				System.out.println("Found an else statement");
			else if (tempArray[i].equals("if"))
				System.out.println("Found an if statement");
			else if (tempArray[i].equals("for"))
				System.out.println("Found a for statement");
			else if (tempArray[i].equals("while"))
				System.out.println("Found a while statement");
			
			
			counter++;
		}
	}
	
	/*
	Going to do the same here pretty much, but
	it has to be slightly different because I think
	we have to go through each character
	
	private void checkValidArithmeticOperation ()
	{
		
	}
	
	*/
	
	
	public void changeToBool (String stringIn)
	{
		
	}
	
	public void changeToOperator (String stringIn)
	{
		
	}
		
}
