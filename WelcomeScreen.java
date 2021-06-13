package Solution;

import java.io.IOException;
import java.util.Scanner;

public class WelcomeScreen {
	
	static String path = ".//File//";
	static Scanner baymax ;

	public static void main(String[] args) throws IOException {
		System.out.println("******************************************************* \n"
				+ "\t    WELCOME TO FILE MANAGEMENT APP \n"
				+" \t COMPANY NAME : SKY SOLVERS LIMITED \n"
				+ "\t DEVELOPED BY GOVINDALURI YATHIRAJ");
		System.out.println("*******************************************************");
		UserPanel.mainMenu();
	}
}