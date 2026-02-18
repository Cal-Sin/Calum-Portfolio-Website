import java.util.Scanner;

/**
 * Represents a plant species
 * 
 * @Author C.Sinclair
 * @Version 1.0
 * 
 */
public class PlantSpecies {
	
	// Fields of a plant species
	
	private String name;
	private String region;
	private double leaveLength; //in millimeters(mm)
	private double leaveWidth; // in millimeters (mm)
	private Scanner s = new Scanner(System.in); // Create a Scanner object 's' to read input from the user
	
	/* ### CONSTRUCTOR METHODS ### */
	/* 
	 * Default Constructor
	 * Initialise fields of the plant species object to default values
	 */
	
	public PlantSpecies() 
	{
		name= ""; // Initialises variable of name to an empty string
		region = ""; // Initialises variable of region to an empty string
		leaveLength = 0.0; // Initialises variable of leaveLength to a default value of 0.0
		leaveWidth = 0.0; // Initialises variable of leaveWidth to a default value of 0.0
	}
	
	/**
	 * Second Overloaded Constructor
	 * Initialise fields of the plant species object to given values
	 * 
	 * @param pName The name of the plant species
	 * @param pRegion The region of the plant species
	 * @param pLeaveLength The length of the leaves on the plant
	 * @param pLeaveWidth The width of the leaves on the plant
	 */

	public PlantSpecies(String pName, String pRegion, double pLeaveLength, double pLeaveWidth) 
	{
		name = pName;
		region = pRegion;
		leaveLength = pLeaveLength;
		leaveWidth = pLeaveWidth;
	}
	
	/* ### GET/SET METHODS ### */
	/**
	 * Get the name of the plant
	 * 
	 * @return The name of the plant
	 */
	
	public String getName() 
	{
		return name;
	}
	
	/*
	 * Set the name of the plant
	 * 
	 * @param pName The name of the plant
	 */
	
	public void setName(String pName) 
	{
		this.name = pName;
	}
	
	/**
	 * Get the region of the plant
	 * 
	 * @return The region of the plant
	 */
	
	public String getRegion() 
	{
		return region;
	}
	
	/**
	 * Set the region of the plant
	 * 
	 * @param pRegion The region of the plant
	 */
	
	public void setRegion(String pRegion) 
	{
		this.region = pRegion;
	}
	
	/**
	 * Get the length of the plant's leaves
	 * 
	 * @return The length of the plant's leaves
	 */
	
	public double getLeaveLength() 
	{
		return leaveLength;
	}
	
	/**
	 * Set the length of the plant's leaves
	 * 
	 * @param pLeaveLength the length of the plant's leaves
	 */
	
	public void setLeaveLength(double pLeaveLength) 
	{
		// Loop until valid leaf length inputed by user
		while (pLeaveLength < 1.3 || pLeaveLength > 25000) {
			
			// Message to inform user of valid range
			System.out.println("Leave length can be values from 1.3mm up to 25,000mm");
			
			// Read the new value inputed by user
			pLeaveLength = s.nextDouble();
		}
		
		// Assign inputed leaf length to the instance variable
		this.leaveLength = pLeaveLength;
	}
	
	/**
	 * Get the width of the plant's leaves
	 * 
	 * @return The width of the plant's leaves
	 */
	
	public double getLeaveWidth()  
	{
		return leaveWidth;
	}
	
	/**
	 * Set the width of the plant's leaves
	 * 
	 * @param pLeaveWidth The width of the plant's leaves
	 */
	
	public void setLeaveWidth(double pLeaveWidth) 
	{
		// Loop until valid leaf width inputed by user
		while (pLeaveWidth < 1.0 || pLeaveWidth > 3000) {
			
			// Message to inform user of valid range
			System.out.println("Leave width can be values from 1mm up to 3000mm");
			
			// Read the new value inputed by user
			pLeaveWidth = s.nextDouble();
		}
		
		// Assign inputed leaf width to the instance variable
		this.leaveWidth = pLeaveWidth;
	}
	
	/* ### OTHER METHODS ### */
	/* 
	 * Setup method
	 * Allows user to input plant species details 
	 */
	
	public void setup() 
	{
		// Create Scanner object 's' to read input from user
		Scanner s = new Scanner(System.in); 
		
		System.out.println("Enter the Name of the plant species please: ");
		name = s.nextLine();
		
		System.out.println("Enter the Region of the plant species please: ");
		region = s.nextLine();
		
		System.out.println("Enter the Length of the leaves on the plant please: ");
		setLeaveLength(s.nextDouble()); // Calling the setLeaveLeangth method to read the leave length entered by the user
		
		System.out.println("Enter the Width of the leaves on the plant please: ");
		setLeaveWidth(s.nextDouble()); // Calling the setLeaveWidth method to read the leave width entered by the user
	}
	
	/* 
	 * Display method 
	 * Displays the details of a plant species
	 */
	
	public void display() 
	{
		System.out.println("Plant Facts:");
		System.out.println("The Species Name: " + getName());
		System.out.println("The Region of species: " + getRegion());
		System.out.println("The length of the species leaves: " + getLeaveLength() + "mm");
		System.out.println("The width of the species leaves: " + getLeaveWidth()+ "mm");
		System.out.println("============");
	}
	
	/*
	 * Method to calculate and return evaporation rate based on the leaf area of a plant species
	 * 
	 * @return The evaporation rate of the plant per day
	 */
	
	public double getEvaporation() 
	{		
		// Leaf area is calculated by multiplying the plant species leaveWidth and leaveLength
		double area = leaveWidth * leaveLength;
		
		//Determines the evaporation rate based on the leaf area calculated
		if (area <= 60) {
			return 2.1;
		} 
		else if (area <= 180) {
			return 4.3;
		} 
		else if (area <= 3000) {
			return 7.7;
		} 
		else if (area <= 8000) {
			return 14.3;
		} 
		else {
			return 24.5;
		}
	}
}