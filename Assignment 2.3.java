import java.util.Scanner;

/*
Peter Nguyen SE 320
Assignment 2

java -ea Main.java
2.3
Write a Java program that prompts the user to enter a number between 0 and 10 and displays the entered number. Use an "assert statement" to determine whether the user entered a number within the valid range. If the user entered a number that is out of range, the program must report an error with assertion error message "The entered number is out of range".
*/

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 0-10 ");
        //String number = myObj.nextLine();
        int num = scan.nextInt();
        System.out.println(num);
        assert num<=10 && num>=0 : "The entered number is out of range";
        
    }
}