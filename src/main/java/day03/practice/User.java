package day03.practice;

import java.util.Scanner;

public class User {
      private String name;
      private String email;
      private String password;
      
      public User() {
    	  this.name = " ";
    	  this.email = " ";
    	  this.password= " ";
      }
      
      public User(String name, String email, String password) {
    	  this.name = name;
    	  this.email = email;
    	  this.password= password;    	  
      }
      public String getName() {
    	  return name;
      }
      public void setName(String name) {
    	  this.name= name;
      }
      public String getEmail() {
    	  return email;
      }
      public void setEmail(String email) {
    	  this.email= email;
      }
      public String getPassword() {
    	  return password;
      }
      public void setPassword(String password) {
    	  this.password= password;
      }
      
      public class TestUser{
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
      }
}
