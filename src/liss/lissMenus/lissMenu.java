package liss.lissMenus;

import java.util.Scanner;

public class LissMenu {
	public LissMenu() {
		System.out.println("We will randomly generate any size length array of numbers from 1-100");
		System.out.println("And return the Longest Subsequence in this array");
		System.out.println("How long would you like the array to be?");
	}
	
	public Integer getUserInput() {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		return length;
	}
}
