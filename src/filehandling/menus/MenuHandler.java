package filehandling.menus;

import java.io.IOException;
import java.util.Scanner;

public class MenuHandler {

    public int DisplayMenu() {

		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
    	do {
    		System.out.println("Enter the number option you would like to choose");
    		System.out.println("(1) Write line to File");
    		System.out.println("(2) Append line to File");
    		System.out.println("(3) Read the File");
    		try {
    			input=scanner.nextInt();
    			break;
    		}
    		catch(NullPointerException npe) {
    			System.out.println("You entered nothing, Please enter 1,2 or 3");
    		}
    		catch(Exception e) {
    			System.out.println("There was an error, Please enter 1,2,3");
    		}
    			
    	}while(scanner.hasNextInt());
    	return input;
    	}
}

