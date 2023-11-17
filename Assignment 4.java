/******************************************************************************
Peter Nguyen

Assignment 4
November 2023
SE 320 ERAU
*******************************************************************************/
package A4;
import java.util.*;
import java.text.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
/*
 * 1. Create two linked hash sets 
 * {"George", "Jim", "John", "Blake", "Kevin", "Michael"}
 * and {"George", "Katie", "Kevin", "Michelle", "Ryan"}
 * and find their union, difference, and intersection. 
 * (You can clone the sets to preserve the original sets 
 * from being changed by these set methods.)
 */
        Set<String> group1 = new LinkedHashSet<>();
        group1.add("George");
        group1.add("Jim");
        group1.add("John");
        group1.add("Blake");
        group1.add("Kevin");
        group1.add("Michael");
        
        Set<String> union = new LinkedHashSet<>();
        union.add("George");
        union.add("Jim");
        union.add("John");
        union.add("Blake");
        union.add("Kevin");
        union.add("Michael");
        
        Set<String> intersection = new LinkedHashSet<>();
        intersection.add("George");
        intersection.add("Jim");
        intersection.add("John");
        intersection.add("Blake");
        intersection.add("Kevin");
        intersection.add("Michael");
        
        Set<String> difference = new LinkedHashSet<>();
        difference.add("George");
        difference.add("Jim");
        difference.add("John");
        difference.add("Blake");
        difference.add("Kevin");
        difference.add("Michael");
        
        Set<String> group2 = new LinkedHashSet<>();
        group2.add("George");
        group2.add("Katie");
        group2.add("Kevin");
        group2.add("Michelle");
        group2.add("Ryan");
        
        union.addAll(group2);
        intersection.retainAll(group2);
        difference.removeAll(group2);
        
		System.out.println("group1 "+group1);
		System.out.println("group2 "+group2);
		System.out.println("union "+union);
		System.out.println("intersection "+intersection);
		System.out.println("difference "+difference);
		System.out.println();

/*
 * 3.
 * a. Write the code to format number 12345.678
 *    in the United Kingdom locale. 
 *        Keep two digits after the decimal point.
 * b. Write the code to format number 12345.678 in U.S. currency.
 * c. Write the code to parse '12,345.678' into a number.
 */
		
        Locale uk = Locale.UK; //new Locale("en","Uk");
        double d = 12345.678;
        NumberFormat nfuk = NumberFormat.getNumberInstance(uk);
        nfuk.setMaximumFractionDigits(2);
        String sA = nfuk.format(d);
        System.out.println("UK number "+sA);
        
        Locale us = Locale.US; //new Locale("en","Us");
        NumberFormat nfus = NumberFormat.getCurrencyInstance(us);
        String sB = nfus.format(d);
        System.out.println("US currency "+sB);
        
        try { 
            NumberFormat nfuk2 = NumberFormat.getNumberInstance(uk);
            String sC = "12,345.678";
            Number n = nfuk2.parse(sC);
            System.out.println("Parse from UK number: " + n);
        } catch (ParseException e) {
            System.err.println("ParseException: " + e.getMessage());
        }
		System.out.println();
        
/*
 * 2. Write a program that reads words from a text file 
 * and displays all the nonduplicate words in ascending order. 
 * (Use a TreeSet to hold the words)
 * */
        String filePath = "C:/Users/ERAU/4.txt";
        TreeSet<String> t = new TreeSet<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                t.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Read lines from text file "+t);
        
        
	}
}
