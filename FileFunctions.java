package Solution;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileFunctions extends WelcomeScreen{

	public static void addFile() throws IOException {
		System.out.println("Enter a File name to create : ");
		
		try  {
			baymax = new Scanner(System.in);
			String fileName = baymax.nextLine();
			File f1 = new File(WelcomeScreen.path + fileName);
				if(f1.createNewFile())
					System.out.println("\n File Created Succesfully ");
				else
					System.out.println("\n File creation Unsuccessful ");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	public static void deleteFile() throws IOException {
		System.out.println("Enter a File name to delete : ");
		baymax = new Scanner(System.in);
		String fileName = baymax.nextLine();
		File f1 = new File(WelcomeScreen.path + fileName);
		
		if(f1.delete())
			System.out.println("\n File deleted Succesfully ");
		else
			System.out.println("\n File doesn't exist ");
		
	}

	public static void searchFile() throws IOException {
		System.out.println("Enter a File name to search : ");
		baymax = new Scanner(System.in);
		String fileName = baymax.nextLine();
		File f1 = new File(WelcomeScreen.path + fileName);

		if(f1.exists()) {
			System.out.println("\n File found Succesfully ");
	    	System.out.println("File name: " + f1.getName());
	    	System.out.println("Absolute path: " + f1.getAbsolutePath());
	    	System.out.println("File size in bytes " + f1.length());
		}
		else {
			System.out.println("\n File not Found :( ");
		}
		
	}

	public static void ListFiles() {
				System.out.println("Listing files : \n");
				File file = new File(WelcomeScreen.path);
				File[] files = file.listFiles();
				Arrays.sort(files);
				for(File eachFile : files) {
					if(eachFile.isDirectory()) {
						File[] folderFiles = eachFile.listFiles();
						for(File fl : folderFiles) {
							System.out.println(fl.getName());
						}
					} 
					else 
						System.out.println(eachFile.getName());
				}
				System.out.println("No. of Files : " + files.length);
		
	}
}
