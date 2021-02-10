package filehandling.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileHandlerService {
	private static final String fileName = "test.txt";
    
    public boolean Read() {
        //TODO: Implement this
    	try {
    		Stream<String> str= Files.lines(Paths.get(fileName));
    		System.out.println(str.collect(Collectors.toList()).toString());
    	}
    	catch(IOException iex) {
    		System.err.println(iex.getMessage());
    		return false;
    	}
    	return true;
    }

    public boolean Write(String textToWrite) {
    	try {
    	      FileWriter myWriter = new FileWriter(fileName);
    	      myWriter.write(textToWrite);
    	      myWriter.close();
    	      System.out.println("Successfully wrote to the file.");
    	} catch (IOException e) {
    	      System.out.println("An error occurred.");
    	      return false;
    	  }
    	return true;
    }

    public boolean Append(String textToAppend) {
    	try { 
            // Open given file in append mode. 
            BufferedWriter out = new BufferedWriter( 
                   new FileWriter(fileName, true)); 
            out.write(textToAppend); 
            out.close(); 
        } 
        catch (IOException e) { 
            System.out.println("exception occoured" + e); 
            return false;
        } 
    	return true;
    }
    public String userInput() {
		Scanner scanner = new Scanner(System.in);
    	while(scanner.hasNextLine()) {
    		try {
				String input = scanner.nextLine();
				return input;
			}
    		catch(Exception e){
    			e.printStackTrace();
    		}
    	}
		return null;
    	
    }

}