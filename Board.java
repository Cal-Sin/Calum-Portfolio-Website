/**
 * Represents a Board object
 * 
 * @Author C.Sinclair
 * @Version 1.0
 * 
 */

public class Board 
{
	// Creating 2d character boards as fields.
	
	private char[][] board1 = new char [18][18];
	private char[][] board2 = new char [18][18];
	
	/* ### CONSTRUCTOR METHOD ### */
	/* 
	 * Default Constructor
	 * Initialises board1 and board2.
	 * Allows other classes to access and utilise this constructor method.
	 */
	
	public Board() 
	{
		 initBoard1();
		 initBoard2();
	}
	
	/* ### Initialisation Methods ### */
	/* 
	 * Helper methods for the constructor method to call
	 */
	
	public void initBoard1() 
	{
		int row, col; 
		
		// Loop through each column
		for (row= 0; row<board1.length; row++) 
		{
			// Loop through each row of that column
			for (col = 0; col<board1.length; col++) 
			{
				// Set each column and row to default value to an empty character
				board1[row][col] = ' '; 
			}
		}
	}
	
	public void initBoard2() 
	{	
		int row, col;
		
		// Loop through each column
		for (row = 0; row<board2.length; row++) 
		{
			// Loop through each row for that column
			for (col = 0; col<board2.length; col++)
			{
				// Set each column and row to default value to an empty character
				board2[row][col] = ' ';
			}
		}
	}
	
	/* ### GET METHODS ###*/
	/*
	 * Get board1
	 * 
	 * @return board1 The first 2d array Board of characters
	 */
	
	public char[][] getBoard1() 
	{
		return board1;
	}
	
	/*
	 * Get board2
	 * 
	 * @return board2 The second 2d array Board of characters
	 */
	
	public char[][] getBoard2() 
	{
		return board2;
	}
	
	/*
	 * Method to place the creatures on a Cell object
	 * Creature can be placed either horizontal or vertical
	 * 
	 * @param cord The coordinate of the cell on board1
	 * @param c The creature being placed
	 */
	
	public void placeCreature(Cell cord, Creature c) 
	{
		int[][]shape = c.getShape();
		// Get the x and y coordinates of the cell object
		int ox = cord.getXCord();
		int oy = cord.getYCord();
		
		for (int[] part : shape) {
			int row = ox + part[0];
			int col = oy +part[1];
			board1[row][col] = c.getSymbol();
		}
	}
	
	/* ### PRINT METHODS ### */
	/*
	 * Print the contents of board1
	 * The method iterates through every cell object in the 2d array of board1
	 */
	
	public void printBoard1() 
	{
		// Loop through each column
		for(int row =0; row<board1[0].length; row++) 
		{
			// Loop through each row in that column
			for(int col =0; col<board1.length; col++) 
			{
				// Print the character stored in each cell object
				System.out.print("[" + board1[row][col] + "]");
			}
			// Move to the next line after each column
			System.out.println();
		}
	}
	
	/*
	 * Print the contents of board2
	 * The method iterates through every cell object in the 2d array of board2
	 * If a cell contains an empty space as a character its prints empty brackets
	 * The empty space signifies its default value
	 * Else it prints the character the cell object holds in brackets
	 */
	
	public void printBoard2()
	{
		// Loop through each column
		for(int row =0; row<board2[0].length; row++) 
		{
			// Loop through each row in that column
			for(int col =0; col<board2.length; col++) 
			{
				// Empty cell causes empty brackets 
				if(board2[row][col] == ' ') {
					System.out.print("[ ]"); 
				}
				// Else print character in brackets
				else {
					System.out.print("[" + board2[row][col] + "]"); 
				}
			}
			// Move to the next line after each column
			System.out.println();
		}
	}
	
	/*
	 * Method to validate the position of a Creature being placed
	 * Checks that all characters of the Creature fit into the Board object
	 * Then checks that all the Cell objects are empty
	 * 
	 * @param cord The first coordinate of the Creature object
	 * @param c The Creature object being placed into a Cell objects
	 * @return boolean True if every part of Creature is valid to be placed, false if not
	 */
	
	public boolean validPosition(Cell cord, Creature c)
	{
		// Get the relative shape of the Creature
		int[][] shape = c.getShape();
		
		// Get the origin of where the Creature is being placed
		int oy = cord.getYCord(); 
		int ox = cord.getXCord();
		
		// Loop through each of the Cretaure's parts
		for (int[] part : shape) 
		{
			// Convert the relative coordinates to absolute coordinates
			int y = oy + part[0];
			int x = ox + part[1];
		
		// Check whether the coordinates are within the bounds of the Board
		if(x < 0 && x >= board1.length && y < 0 && y >= board1.length) 
		{ 
			// Return false if they are out of bounds
			return false;
		}	
		
			// Check that the Cell objects are empty and without a Creature
			if (board1[y][x] != ' ')
			{ 	 
				// Return false if Creature already occupies Cell
				return false; 
			}
		}
		// Return true if no conditions met meaning it is a valid position
		return true;
	}
	
	/*
	 * Method to ensure valid creature placement
	 * 
	 * @param cord The coordinate of the cell object
	 * @return boolean Whether a cell object meets the condition for placing a creature
	 */
	
	public boolean validGuess(Cell cord) 
	{
		// Get the x and y coordinates of the cell object
		int y = cord.getYCord();
		int x = cord.getXCord();
		
		// If statement to check whether the x and y coordinate are within the bounds of the array.
		if(x >= 0 && x < board1.length && y >= 0 && y < board1.length)
		{
			// Return true if condition is met
			return true;
		}
		// Return false if condition is not met
		return false;
	}
	
	/*
	 * Method to check whether all of the opponents creatures have been revealed
	 * The method compares the opponents hidden board with the visible board
	 * Checking and comparing each cell
	 * If the cell on the hidden board contains a creature
	 * and the opponents visible board does not yet have that creature
	 * then the game continues. 
	 * 
	 * @param opponentBoard1 The opponent's hidden board containing their creatures
	 * @return boolean Whether all the creatures have been revealed.
	 */
	
	public boolean allCreaturesRevealed(char[][] opponentBoard1) {
	    
		// Loop through each column
		for (int row = 0; row < board1.length; row++) 
	    {
			// Loop through each row in that column
	        for (int col = 0; col < board1[0].length; col++) 
	        {
	            // Checks if opponent's board1 has a creature and it has not been revealed on board2 yet
	            if (opponentBoard1[row][col] != ' ' && board2[row][col] != opponentBoard1[row][col]) 
	            {
	            	// Return false as their are still hidden creatures
	                return false;
	            }
	        }
	    }
		// Return true as all creatures have been found
	    return true;
	}
}

