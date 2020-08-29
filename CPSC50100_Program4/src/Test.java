//********************************************
//	Test.java		Author: Ben Callen
//
//	Driver program for Set.java
//********************************************

import java.util.Scanner;

public class Test {
    public static void main (String[] args) {
    	
    	System.out.println("Programming Fundamentals");
    	System.out.println("NAME: Ben Callen");
    	System.out.println("PROGRAMMING ASSIGNMENT 4 - SET");
    	
    	Set set = new Set();
    	
    	String input = "";
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Correct commands are: add, del, and exists, then any number.");
    	
    	//starts infinite loop of program
    	while(true) {
    		System.out.print("Enter command: ");
    		input = scanner.nextLine();
    		String numbers[] = input.split(" ");
    		
    		//begins by checking to see if there are two elements in the array
    		if(numbers.length==2) {
    			if(numbers[0].trim().equalsIgnoreCase("add")) {
    				try {
    					int number = Integer.parseInt(numbers[1]);
    					set.add(number);
    					System.out.println(set);
    				}
    				catch (Exception e) {
    					System.out.println("Invalid entry, please try again.");
    				}
    			}
    				else if(numbers[0].trim().equalsIgnoreCase("del")) {
    					try {
    						int number = Integer.parseInt(numbers[1]);
    						set.delete(number);
    						System.out.println(set);
    					}
    					catch (Exception e) {
    						System.out.println("Invalid entry, please try again.");
    					}
    				}
    				else if(numbers[0].trim().equalsIgnoreCase("exists")) {
    					try {
    						int number = Integer.parseInt(numbers[1]);
    						System.out.println(set.exists(number));
    					}
    					catch(Exception e) {
    						System.out.println("Invalid entry, please try again.");
    					}
    				}
    				else {//if user does not enter add, del, or exists, prompts user to retry command entry
    					System.out.println("Invalid command. Please try again");
    				}
    			}
    				else { //provides instructions for how to enter command
    					System.out.println("Correct usage is command then number.");
    				}
    			}
    		}
		}
