package day03.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class TestUser {
	  /**
	 * @author HariharanVeerakumar
	 */
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  String UserName= sc.next();
		  String UserEmail = sc.next();
		  String UserPassword = sc.next();
		  
		User user = new User(UserName ,UserEmail, UserPassword);
		System.out.println("Hi! "+ user.getName()+ ".");
		System.out.println("This is your email id "+user.getEmail()+ " .");
		System.out.println("This is your password "+ user.getPassword()+ " .");
	}
  
	@Test
	public void testGettersSetters() {
		User user = new User("hariharan" ,"hari@gmail.com", "StrongPassword!");
		assertEquals("hariharan", user.getName());
		assertEquals("hari@gmail.com", user.getEmail());
		assertEquals("StrongPassword!", user.getPassword());
		
		
	}

}
