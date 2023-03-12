package VirtualKeyforRepo;

import java.util.List;
import java.util.Scanner;

public class MethodSelector {
	public static void priMenuOptions() {
		boolean continUE = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				WelcomeScreen.primaryMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					FileOps.displayAllFiles("main");
					break;
				case 2:
					MethodSelector.secMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					continUE = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				priMenuOptions();
			} 
		} while (continUE == true);
	}
	
	public static void secMenuOptions() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				WelcomeScreen.secondaryMenu();
				FileOps.createMainFolderIfNotPresent("main");
				
				int input = sc.nextInt();
				switch (input) {
				case 1:
					// File Add
					System.out.println("Enter the name of the file to be added to the \"main\" folder");
					String fileToAdd = sc.next();
					
					FileOps.createFile(fileToAdd, sc);
					
					break;
				case 2:
					// File/Folder delete
					System.out.println("Enter the name of the file to be deleted from \"main\" folder");
					String fileToDelete = sc.next();
					
					FileOps.createMainFolderIfNotPresent("main");
					List<String> filesToDelete = FileOps.displayFileLocations(fileToDelete, "main");
					
					String deletionPrompt = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete all elements)";
					System.out.println(deletionPrompt);
				
					int idx = sc.nextInt();
					
					if (idx != 0) {
						FileOps.deleteFileRecursively(filesToDelete.get(idx - 1));
					} else {
						
						// If idx == 0, delete all files displayed for the name
						for (String path : filesToDelete) {
							FileOps.deleteFileRecursively(path);
						}
					}
					

					break;
				case 3:
					// File/Folder Search
					System.out.println("Enter the name of the file to be searched from \"main\" folder");
					String fileName = sc.next();
					
					FileOps.createMainFolderIfNotPresent("main");
					FileOps.displayFileLocations(fileName, "main");

					
					break;
				case 4:
					// Go to Previous menu
					return;
				case 5:
					// Exit
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				secMenuOptions();
			}
		} while (running == true);
	}
}
