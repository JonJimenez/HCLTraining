package filehandling;

import filehandling.menus.MenuHandler;
import filehandling.services.FileHandlerService;
public class FileHandlingApplication {

	public static void main(String[] args) {
		MenuHandler menuHandler = new MenuHandler();
		FileHandlerService filehandlerService = new FileHandlerService();
		while(true) {
			int option = menuHandler.DisplayMenu();
			switch(option) {
				case 1:
					filehandlerService.Write(filehandlerService.userInput());
					break;
				case 2: 
					filehandlerService.Append(filehandlerService.userInput());
					break;
				case 3: 
					filehandlerService.Read();
					break;
			}
		}
	}
}