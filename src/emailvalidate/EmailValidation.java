package emailvalidate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	static boolean isValid(String email) {
		final String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		final Pattern pattern = Pattern.compile(regex);
		final Matcher matcher = pattern.matcher(email);
		
		if (matcher.find()) {
		    System.out.println(email+" is valid");
		    return true;
		}
		System.out.println(email+" is not a valid email");
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] emailDatabase={"hello@gmail.com","yellow@gmail.com","peter@yahoo.com","CountDracula@hotmail.com","Jonathan@att.com"};
		System.out.println("What valid Email would you like us to see if it is in the database?");
		
		while(sc.hasNextLine()) {
			String input = sc.next();//if the user input something other than null
			outerloop:
			if(isValid(input)) {
				for(String email:emailDatabase) {
					if(input.equals(email)) {
						System.out.println("Your email, "+input+", is in our database");
						break outerloop;
					}
				}
				System.out.println("Sorry your email, "+input+", is not in our database");
			}
			}
		}
}
