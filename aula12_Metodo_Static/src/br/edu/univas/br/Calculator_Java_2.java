package br.edu.univas.br;

import java.util.Scanner;

public class Calculator_Java_2 {
	
	public static void main(String[]args) {
		
		printMenu();
		
		Scanner reading = new Scanner(System.in);
		
		double option = 0;
		
		do {
			
			System.out.println("Type a number:");
		        option = reading.nextDouble();
		    
		    double c = 0;
			
			if(option == 1) {
				
				System.out.println("Enter a valor:");
				    double a = reading.nextDouble();
				System.out.println("Enter a valor:");
				    double b = reading.nextDouble(); 
				    
				c = sum(a,b);
				
				System.out.println("The result is: " + c);
				System.out.println();
				
			} else if(option == 2) {
				
				System.out.println("Enter a valor:");
			        double a = reading.nextDouble();
			    System.out.println("Enter a valor:");
			        double b = reading.nextDouble(); 
			    
			    c = subtraction(a,b);
			
			    System.out.println("The result is: " + c);
				System.out.println();
			    
			} else if(option == 3) {
				
				System.out.println("Enter a valor:");
			        double a = reading.nextDouble();
			    System.out.println("Enter a valor:");
			        double b = reading.nextDouble(); 
			    
			    c = multiplication(a,b);
			
			    System.out.println("The result is: " + c);
			    System.out.println();
			    
			} else if(option == 4) {
				
				System.out.println("Enter a valor:");
			        double a = reading.nextDouble();
			    System.out.println("Enter a valor:");
			        double b = reading.nextDouble(); 
			    
			    c = division(a,b);
			
			    System.out.println("The result is: " + c);
			    System.out.println();
			}
		
		} while (option != 9);
		
		reading.close();
	}

	public static void printMenu() {
		
		System.out.println("     CALCULATOR");
		System.out.println();
    	System.out.println("1 - addition");
    	System.out.println("2 - subtraction");
    	System.out.println("3 - multiplication");
    	System.out.println("4 - division");
    	System.out.println("9 - EXIT");
    	System.out.println();
    	System.out.println("     Choose an option:");
	}
	
	public static double sum(double a, double b) {
		return a+b;
	}
	
	public static double subtraction(double a, double b) {
		return a-b;
	}
	
	public static double multiplication(double a, double b) {
		return a*b;
	}
	
	public static double division(double a, double b) {
		return a/b;
	}
}
