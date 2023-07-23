package day10.practice;



import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestEmailExists {
	
	@Test
	public void testRegister() {
		User user1 = new User(1, "Hari", "hari@gmail.com");
		User user2 = new User(2,"Haran","haran@gmail.com");
		User user3 = new User(3,"Hariharan", "hari@gmail.com");
		
		UserManagement userManage = new UserManagement();
		
		try {
            userManage.register(user1);
            userManage.register(user2);
            userManage.register(user3);
            fail("Expected UserExistsException not thrown");
        } catch (UserExistsException e) {
            assertEquals("User with email ID hari@gmail.com already exists", e.getMessage());
        }
	}
	
	@Test
	public void testRegisterNoException() {
		 User user1 = new User(1, "Hari", "hari@gmail.com");
	        User user2 = new User(2, "Haran", "haran@gmail.com");

	        UserManagement userManage = new UserManagement();
	        

	        ArrayList<User> userList = userManage.userList;
	        userList.add(user1);
	        userList.add(user2);
	        assertEquals(2, userList.size());
	        assertEquals("hari@gmail.com", userList.get(0).emailId);
	        assertEquals("haran@gmail.com", userList.get(1).emailId);
	}
	
	@Test
	public void testInvalidRegister() {
		 User user1 = new User(1, "Hari", "hari@gmail.com");
	        User user2 = new User(2, "Haran", "haran@gmail.com");

	        UserManagement userManage = new UserManagement();
	        

	        ArrayList<User> userList = userManage.userList;
	        userList.add(user1);
	        userList.add(user2);
	        assertNotEquals(3,userList.size());
	        assertNotEquals("haran@gmail.com",userList.get(0).emailId);
	        assertNotEquals("hari@gmail.com",userList.get(1).emailId);
	}

}
