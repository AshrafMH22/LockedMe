package VirtualKeyforRepo;

public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOps.createMainFolderIfNotPresent("main");
		
		WelcomeScreen.welcScreen("LockedMe", "Ashraf M. Husain");
		
		MethodSelector.priMenuOptions();
	}

	
}
