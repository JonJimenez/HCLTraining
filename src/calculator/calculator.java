package calculator;

import java.util.Scanner;
import java.lang.*; 
import java.util.Objects;

public class calculator {
	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator!!");
		System.out.println("I can add,substract,multiply and divide");
		System.out.println("Ex. 2.1+2 or 5*5 or 6/3 or 3-2");
		System.out.println("Enter 'exit' if you want to leave");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			Character operator=null;
					String input = sc.next();//if the user input something other than null
					if(input.equals("exit")) {
						break;
					}
					input=input.replaceAll("\\s","");//removes all spaces
					for(int i=0;i<input.length();i++) {
						if(!Character.isDigit(input.charAt(i))){
							if(input.indexOf(".",i-1)!=i) {
								operator=input.charAt(i);//found the operator used
							}
						};
					}
			String array[] = input.split("\\"+String.valueOf(operator));
			try {
				float total = 0;
				float firstNum=Float.parseFloat(array[0]);
				float secondNum=Float.parseFloat(array[1]);
				switch(String.valueOf(operator)) {
					case "+":total=firstNum+secondNum;
							break;
					case "-":total=firstNum-secondNum;
						break;
					case "*":total=firstNum*secondNum;
						break;
					case "/":total=firstNum/secondNum;
						break;
				}
					System.out.println("Your input:"+input+"="+total);
			}
			catch(Exception e) {
				System.out.println("You did not enter in the correct format");
				System.out.println("Ex. 2+2 or 5*5 or 6/3 or 3-2");
			}
		}
		sc.close();
		System.out.println("Exiting....");
	}
}