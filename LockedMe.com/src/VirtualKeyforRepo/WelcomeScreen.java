package VirtualKeyforRepo;

public class WelcomeScreen {

	public static void welcScreen(String appName, String developerName) {
		System.out.printf("*****************************************************"
				+ "   Welcome to %s.com.    *****************************************************\n" 
				+ "***************************************************** Developed by %s."
				+ "*****************************************************\n", appName, developerName);
		
		System.out.println("\n\nThe main functions of this application are :-\n"
				+ "� To Retrieve all file names in the \"main\" folder\n"
				+ "� To Search, Add or Delete files in \"main\" folder.\n"
				+ "\n\n**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n");
		
	}

	public static void primaryMenu() {
		System.out.println("\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n");

	}

	public static void secondaryMenu() {
		System.out.println("\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n");
	}

}
