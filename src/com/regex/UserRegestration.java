package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegestration {

	 public static void FirstName(String firstName){
	        boolean verify = (Pattern.matches("^[A-Z][a-z]{2,}$", firstName));
	        if (verify){
	            System.out.println("input is valid "+ firstName);
	        }else {
	            System.out.println("input is invalid");
	        }
	    }
	    public static void LastName(String LastName){
	        boolean verify = (Pattern.matches("^[A-Z][a-z]{2,}$", LastName));
	        if (verify){
	            System.out.println("input is valida "+ LastName);
	        }else {
	            System.out.println("invalid input");
	        }
	    }
	    public static void Email(String email){
	        boolean verify = (Pattern.matches("^[A-za-z]+([_+-.][a-zA-Z])*[@][a-zA-Z]+[.][a-z]{2,3}([.][a-z]{2})*$", email));
	        if (verify){
	            System.out.println("Entered "+ email + " is valid");
	        }else {
	            System.out.println("invalid input");
	        }
	    }
	    public static void PhoneNumber(String phnum){
	        boolean verify = Pattern.matches("^[+](91)[6-9][0-9]{9}$", phnum);
	        if (verify){
	            System.out.println("phone number : "+ phnum + " valid");
	        }else {
	            System.out.println("invalid input");
	        }
	    }
	    public static void Password(String password1){
	        boolean verify = Pattern.matches("^[A-Za-z0-9]{8,}$", password1);
	        if (verify){
	            System.out.println("Password : "+ password1 + " valid");
	        }else {
	            System.out.println("invalid input");
	        }
	    }
	    public static void Password2(String passwordrule2){
	        boolean verify = Pattern.matches("^[A-Za-z0-9]{8,}$", passwordrule2);
	        if (verify){
	            System.out.println("Password : "+ passwordrule2 + " valid");
	        }else {
	            System.out.println("invalid input");
	        }
	    }
	    public static void Password3(String passwordrule3){
	        boolean verify = Pattern.matches("^[a-z]{8}[A-Z]{1}[0-9]{1}$", passwordrule3);
	        if (verify){
	            System.out.println("Password : "+ passwordrule3 + " valid");
	        }else {
	            System.out.println("invalid input");
	        }
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to the User Registration Problem");
	        Scanner sc = new Scanner(System.in);

	        System.out.print("First Name : ");
	        String firstName = sc.next();

	        FirstName(firstName);

	        System.out.print("Last name : ");
	        String lastName = sc.next();

	        LastName(lastName);

	        System.out.print(" Email id : ");
	        String email = sc.next();

	        Email(email);
	        System.out.print("Phone number: ");
	        String phnum = sc.next();

	        PhoneNumber(phnum);
	        
	        System.out.println("password:");
	        String password1 = sc.next();
	        Password(password1);
	        
           System.out.println("password");
           String passwwordrul2 = sc.next();
          
           
	        
	    }
}
