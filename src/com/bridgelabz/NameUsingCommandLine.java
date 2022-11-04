package com.bridgelabz;

import java.util.Scanner;

public class NameUsingCommandLine {
	  public static void main(String[] args) {
   	   Scanner user_input = new Scanner( System.in );
   	   String first_name;
   	   System.out.print("Enter your first name: ");
   	   first_name = user_input.next( );
   	  
   	  System.out.println("My name is " +first_name);
      }
	
}


