package liss;

import liss.lissMenus.LissMenu;
import liss.lissServices.LissService;

public class LissApplication {
	public static void main(String[] args) {
		
		LissMenu menu= new LissMenu();
		int length = menu.getUserInput();
		LissService service = new LissService();
		service.generateRandomArray(length);
		service.printArray();
		service.findLiss();
		service.printLiss();
	}
	
}
