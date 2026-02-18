import java.util.Scanner;

/* Represents a collection of plants found
 * 
 * @Author C.Sinclair
 * @Verison 1.0
 *
 */

public class Herbarium {
	
	// Creating instance fields in the Herbarium
	
	private PlantSpecies plant1;
	private PlantSpecies plant2;
	private PlantSpecies plant3;
	private PlantSpecies plant4;
	private PlantSpecies plant5;
	private PlantSpecies plant6;
	private PlantSpecies plant7;
	private PlantSpecies plant8;
	private PlantSpecies plant9;
	private PlantSpecies plant10;

	/* ###Constructor Methods### */
	/*
	 * Creating PlantSpecies objects
	 */

	public Herbarium()
	{
		// Empty input parameters as fields still default
		plant1 = new PlantSpecies();
		plant2 = new PlantSpecies();
		plant3 = new PlantSpecies();
		plant4 = new PlantSpecies();
		plant5 = new PlantSpecies();
		// Initialises PlantSpecies objects with given name, region, leaf length, and leaf width using second constructor in PlantSpecies class
		plant6 = new PlantSpecies("Rosa sp.", "China", 1.3, 1);
		plant7 = new PlantSpecies("Helianthus", "Ireland", 10.3, 100);
		plant8 = new PlantSpecies("Quercus robur", "Europe", 10000, 1500);
		plant9 = new PlantSpecies("Lavandula angustifolia", "England", 20000, 2500);
		plant10 = new PlantSpecies("Thistle", "Scotland", 9000, 300);
	}
	
	/*
	 *  Method to setup the collection 
	 *  Calling the 'setup' method from the PlantSpecies class 
	 */
	
	public void setupCollection() 
	{
		plant1.setup();
		plant2.setup();
		plant3.setup();
		plant4.setup();
		plant5.setup();
	}
		
	/*
	 *  Method to display the details of the plant species in the Herbarium
	 *   
	 *  Calls the display method in the PlantSpecies class to display the details of the plant species objects
	 */
	 
	
	public void displayHerbarium()
	{
		System.out.println("Plant Species in the Herbarium:");
		System.out.println("==============================="); // Line to separate heading from the details displayed

		plant1.display();
		plant2.display();
		plant3.display();
		plant4.display();
		plant5.display();
		plant6.display();
		plant7.display();
		plant8.display();
		plant9.display();
		plant10.display();
	}
	
	/* 
	 * Method to enable a search function
	 * Allows the user to search a plant species by name or region
	 * If the 'search' matches a name or region of a plant species object, then details of plant are displayed
	 * if the 'search' does not match a known object then an error message is displayed
	 */
	
	public void search() 
	{
		// Create a Scanner object to read user input
		Scanner s = new Scanner(System.in); 
		
		// Variable given to user's input (empty string)
		String search = "";
		
		System.out.println("Search for a plant species details by name or region: ");
		search = s.nextLine(); // Read the input, assign string to search variable
		
		// 'If' statement to check if the search matches the name or region of any plant 
		if ((plant1.getName().toLowerCase().equals(search.toLowerCase())) || (plant1.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			plant1.display(); // Display details of object 'plant1' if match found
		} 
		else if ((plant2.getName().toLowerCase().equals(search.toLowerCase())) || (plant2.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			plant2.display(); // Display details of object 'plant2' if match found
		} 
		else if ((plant3.getName().toLowerCase().equals(search.toLowerCase())) || (plant3.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			plant3.display(); // Display details of object 'plant3' if match found
		}
		else if ((plant4.getName().toLowerCase().equals(search.toLowerCase())) || (plant4.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			plant4.display(); // Display details of object 'plant4' if match found
		} 
		else if ((plant5.getName().toLowerCase().equals(search.toLowerCase())) || (plant5.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			plant5.display(); // Display details of object 'plant5' if match found
		}
		else if ((plant6.getName().toLowerCase().equals(search.toLowerCase())) || (plant6.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			plant6.display(); // Display details of object 'plant6' if match found
		} 
		else if ((plant7.getName().toLowerCase().equals(search.toLowerCase())) || (plant7.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			plant7.display(); // Display details of object 'plant7' if match found
		} 
		else if ((plant8.getName().toLowerCase().equals(search.toLowerCase())) || (plant8.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			plant8.display(); // Display details of object 'plant8' if match found
		} 
		else if ((plant9.getName().toLowerCase().equals(search.toLowerCase())) || (plant9.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			plant9.display(); // Display details of object 'plant9' if match found
		} 
		else if ((plant10.getName().toLowerCase().equals(search.toLowerCase())) || (plant10.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			plant10.display(); // Display details of object 'plant10' if match found
		} 
		else {
			//Error message displayed when no matches 
			System.out.println("There are no plants matching your search!");
			System.out.println("=========================================");
		}
	}
	
	/* 
	 * Method to get the evaporation rate of plant species
	 * Allows the user to search a plant species by name or region to calculate and then display the evaporation rate per day of that plant species
	 * If the 'search' matches a name or region of a plant species object, then details of plant are displayed
	 * if the 'search' does not match a known object then an error message is displayed
	 */
	
	public void evaporationRate() 
	{
		// Create a Scanner object to read user input
		Scanner s = new Scanner(System.in); 
		
		// Variable given to user's input (empty string)
		String search = "";
		
		System.out.println("Calculate the evarporation rate per day of a plant by inputing it's name or region");
		search = s.nextLine(); // Read the input, assign string to search variable
		
		// 'If' statement to check if the search matches the name or region of any plant 
		if ((plant1.getName().toLowerCase().equals(search.toLowerCase())) || (plant1.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			System.out.println("The evaporation rate per day of " + plant1.getName() + " is: " + plant1.getEvaporation() + "mm");
		} 
		else if ((plant2.getName().toLowerCase().equals(search.toLowerCase())) || (plant2.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			System.out.println("The evaporation rate per day of " + plant2.getName() + " is: " + plant2.getEvaporation() + "mm");
		} 
		else if ((plant3.getName().toLowerCase().equals(search.toLowerCase())) || (plant3.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			System.out.println("The evaporation rate per day of " + plant3.getName() + " is: " + plant3.getEvaporation() + "mm");
		} 
		else if ((plant4.getName().toLowerCase().equals(search.toLowerCase())) || (plant4.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			System.out.println("The evaporation rate per day of " + plant4.getName() + " is: " + plant4.getEvaporation() + "mm");
		} 
		else if ((plant5.getName().toLowerCase().equals(search.toLowerCase())) || (plant5.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			System.out.println("The evaporation rate per day of " + plant5.getName() + " is: " + plant5.getEvaporation() + "mm");
		} 
		else if ((plant6.getName().toLowerCase().equals(search.toLowerCase())) || (plant6.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			System.out.println("The evaporation rate per day of " + plant6.getName() + " is: " + plant6.getEvaporation() + "mm");
		} 
		else if ((plant7.getName().toLowerCase().equals(search.toLowerCase())) || (plant7.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			System.out.println("The evaporation rate per day of " + plant7.getName() + " is: " + plant7.getEvaporation() + "mm");
		} 
		else if ((plant8.getName().toLowerCase().equals(search.toLowerCase())) || (plant8.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			System.out.println("The evaporation rate per day of " + plant8.getName() + " is: " + plant8.getEvaporation() + "mm");
		}
		else if ((plant9.getName().toLowerCase().equals(search.toLowerCase())) || (plant9.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			System.out.println("The evaporation rate per day of " + plant9.getName() + " is: " + plant9.getEvaporation() + "mm");
		} 
		else if ((plant10.getName().toLowerCase().equals(search.toLowerCase())) || (plant10.getRegion().toLowerCase().equals(search.toLowerCase()))) {
			System.out.println("The evaporation rate per day of " + plant10.getName() + " is: " + plant10.getEvaporation() + "mm");
		} 
		else {
			System.out.println("There are no plants matching your search!");
			System.out.println("=========================================");
		}
	}
	
	/* ### The Main Method- Entry point from program ###*/
	
	public static void main(String[] args) 
	{
		// Create instance of the Herbarium class to call upon methods
		Herbarium h = new Herbarium(); 
		
		// Create a Scanner object to read user input
		Scanner s = new Scanner(System.in);
		
		// Variable for storing user's menu 'option' selected
		int option = 0; 
	
		/*
		 *  Menu display presented to user upon program launch
		 * The user is able to continuously select 'options' until selecting to exit
		 */
		
		do {
			// Display Menu
			System.out.println("Welcome to the Herbarium - a plant species database!");
			System.out.println("Please select an option: ");
			System.out.println("1.Create the Herbarium by inputing plant species");
			System.out.println("2.Display the Herbarium");
			System.out.println("3.Search the Herbarium");
			System.out.println("4.Calculate the evaporation rate of a plant");
			System.out.println("5.Exit");
			
			//Read the integer entered by the user and store it as option variable
			option = s.nextInt(); 
			
			// 'Switch' statement to respond to user's option
			switch (option) {
			case 1: 
				h.setupCollection(); // Calls method for the user to create the collection by inputing plant species details
				break;
				
			case 2:
				h.displayHerbarium(); // Calls method to display all the plant species in the Herbarium
				break;
				
			case 3:
				h.search(); // Calls method to search for a plant species in the herbarium, then display it's details
				break;
			
			case 4:
				h.evaporationRate(); // Calls method to search for a plant species, to calculate and display the evaporation rate per day
				break;
				
			case 5:
				System.out.println("Bye!"); // Exit message displayed
				break;
				
			default:
				System.out.println("Invalid option"); // Message displayed for an invalid input
				break;
			}
		}
		 // 'While' loop to allow user to stop program
		while (option !=5);
	}
}
