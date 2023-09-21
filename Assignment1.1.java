//Write a Java program that prompts the user to enter two integers and displays their sum. Use exception handling to prompt the user for reading the number again if the input is incorrect.

// SE 320 September 2023

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int z;
	  
	System.out.print("Enter first int: ");
    String x = scan.nextLine();
	System.out.print("Enter second int: ");
    String y = scan.nextLine();
	
	try {
		z = Integer.parseInt(x)+Integer.parseInt(y);
	}
	catch (NumberFormatException e){		
		System.out.println("You entered non integer, try again");
		System.out.print("Enter first int: ");
	    x = scan.nextLine();
		System.out.print("Enter second int: ");
	    y = scan.nextLine();
	}

	z = Integer.parseInt(x)+Integer.parseInt(y);

	System.out.println("Sum is "+z);
	
	  
  }
}