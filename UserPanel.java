package Solution;

import java.io.IOException;
import java.util.Scanner;


public class UserPanel extends WelcomeScreen{
	
	
	/* Method for User Interface */
	
	public static void mainMenu() throws IOException {
		
		System.out.println("\n\t   >>>>>>>>>> Main Menu <<<<<<<<<< ");
		System.out.println("\t1. List Files \t 2. File Operations 3. Exit");
		
		System.out.print("\n Enter a valid option : ");
		 baymax = new Scanner(System.in);
		int option = baymax.nextInt();
		
		/* Main Menu For Switch Case*/
		
		switch(option) {
		
		case 1: 
			FileFunctions.ListFiles();
			mainMenu();
			break;
		case 2:  secondMenu();
				break;
		case 3: System.out.println("BYE !!! Thank You For using the Application");
				System.exit(0);
				break;
		default : System.out.println("Please Enter a Valid Option");
		mainMenu();
		}
	}
	
	
	
	public static void secondMenu() throws IOException {
		System.out.println("\n\t  >>>>>>>>>> File Operations <<<<<<<<<< ");
		System.out.println("\t1. Add a File \t 2. Delete a File \n \t3. Search a File 4. Back to Main Menu");
		System.out.print("\nSelect a option : ");
		baymax = new Scanner(System.in);
		int selection = baymax.nextInt();
		
		switch(selection) {
		
		case 1: FileFunctions.addFile(); secondMenu() ;break;
			
		case 2: FileFunctions.deleteFile(); secondMenu() ; break;
			
		case 3: FileFunctions.searchFile(); secondMenu() ; break;
			
		case 4: mainMenu(); break;
			
		default: System.out.println("Please Enter a Valid Option");
		secondMenu(); break;
		
		}
		
		
	}


}
