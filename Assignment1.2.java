/* Write a Java program that meets the following requirements:
- Creates an array with 100 randomly chosen integers.
- Prompts the user to enter the index of the array, then displays the corresponding element value. If the specified index is out of bounds, catch the exception and display the message "Out of Bounds".
*/


// SE 320 September 2023

import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] ia = new int[100];

	for (int i=0; i<100; i++) {
		ia[i]= (int)(Math.random()*10);
	}
	
	System.out.print("\nEnter int index of array: ");
    String i = scan.nextLine();
	
	try {	
			System.out.println("Value of index is "+ia[Integer.parseInt(i)]);
	}	catch (NumberFormatException e) {		
			System.out.println("You entered non integer, bye");
	}	catch (ArrayIndexOutOfBoundsException e) {		
			System.out.println("Out of Bounds");
	}
	  
  }
}