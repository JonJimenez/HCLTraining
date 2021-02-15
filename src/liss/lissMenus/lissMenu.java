package liss.lissMenus;

import java.util.Scanner;

public class lissMenu {
	public void DisplayMenu() {
		System.out.println("We will randomly generate any size length array of numbers");
		System.out.println("What would you like the array length to be?");
		System.out.println("Enter nothing if you want to exit");
	}
	
	public Integer getUserInput() {
		DisplayMenu();
		Scanner sc = new Scanner(System.in);
		try {
			while(sc.hasNext()) {
				return sc.nextInt();
			}
		}
		finally{
			return null;
		}
		
	}
}
