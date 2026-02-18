/**
 * Represents a cell object
 * 
 * @Author C.Sinclair
 * @Version 1.0
 * 
 */
public class Cell 
{
	// Fields of a cell
	
	private int yCord;
	private int xCord;
	
	/* ### CONSTRUCTOR METHODs ### */
	/* 
	 * Default Constructor
	 * Initialise fields of the cell object to default values.
	 */
	
	public Cell() 
	{
		yCord = 0;
		xCord = 0;
	}
	
	/*
	 * Second Overloaded Constructor
	 * Initialise fields of the cell object to given values
	 * 
	 * @param xCord The x-coordinate of the cell
	 * @param yCord The y-coordinate of the cell
	 */
	
	public Cell(int yCord, int xCord) 
	{
		this.yCord = yCord;
		this.xCord = xCord;
	}
	
	/* ### SET/GET METHODS ### */
	/**
	 * Set the xCord of the cell
	 * Set the yCord of the cell
	 * 
	 * @param The x-coordinate of the cell
	 * @param The y-coordinate of the cell
	 */
	
	public void setCell(int xCord, int yCord) 
	{
		this.xCord = xCord;
		this.yCord = yCord;
	}
	
	/*
	 * Get the xCord of the cell 
	 * 
	 * @return xCord The x-coordinate of the cell
	 */
	
	public int getXCord() 
	{
		return xCord;
	}
	
	/*
	 * Get the yCord of the cell
	 * 
	 * @return yCord The y-coordinate of the cell
	 */
	
	public int getYCord() 
	{
		return yCord;
	}
	
	/*
	 * Method to return the cell coordinates in a String 
	 * 
	 * @return cellPrint The cell coordinates as a String.
	 */
	
	public String cellPrint() 
	{
		return "[ " + yCord + ", " + xCord + " ]";
	}
	
	/*
	 * Method to return whether the cell contains a creature
	 * 
	 * @return true The cell contains a creature
	 */
	
	public boolean hasCreature(Cell coord) 
	{
		return true;
	}
}