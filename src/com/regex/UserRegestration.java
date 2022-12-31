package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegestration {

	 public static boolean verifyFirstName(String firstName){
	        return (Pattern.matches("^[A-Z][a-z]{2,}$", firstName));
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to the User Registration Problem...!!!");
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Please enter the First Name :: ");
	        String firstName = sc.next();

	        if (verifyFirstName(firstName)){
	            System.out.println("input is valid "+ firstName);
	        }else {
	            System.out.println("input is invalid");
	        }
	    }

}
