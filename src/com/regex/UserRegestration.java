package com.regex;

import java.util.regex.Pattern;

public class UserRegestration {

	public static void main(String[] args) {
		boolean pattern = Pattern.compile("^[A-Z]{1}[a-z]{2}$").matcher("Anu").matches();
		
		if (pattern == true) {
			System.out.println("pass: "+pattern);
		}
		else {
			System.out.println("fail");
		}
	}

}
