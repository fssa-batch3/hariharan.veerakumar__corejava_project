package day02.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestUser {
	public static void main(String[] args) {
		User user = new User();
		// for Id
        user.setId(10);
        int userId = user.getId();
        System.out.println(userId);
        
        
        // for name
        user.setName("Hariharan");
        String userName = user.getName();
        System.out.println(userName);
        
        // for email
        user.setEmail("hari@gmail.com");
        String userEmail = user.getEmail();
        System.out.println(userEmail);
        
        // for password
        user.setPassword("StrongPassword");
        String userPassword = user.getPassword();
        System.out.println(userPassword);
	}
	
	@Test
	public void testGettersSetters() {
		User user = new User();
		  user.setId(10);
		  user.setName("Hariharan");
		  user.setEmail("hari@gmail.com");
		  user.setPassword("StrongPassword");
		  
		  assertEquals(10,user.getId());
		  assertEquals("Hariharan",user.getName());
		  assertEquals("hari@gmail.com",user.getEmail());
		  assertEquals("StrongPassword",user.getPassword());
		
	}
	

}
