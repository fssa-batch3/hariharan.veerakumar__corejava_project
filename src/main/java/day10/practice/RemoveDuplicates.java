package day10.practice;

import java.util.ArrayList;

class User {
    int id;
    String name;
    String emailId;
    
    public User(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }
}


class UserManagement{
	
private ArrayList<User> userList = new ArrayList<>();

public void register(User user) throws UserExistsException{
	for (User ExistingUser : userList) {
		if(ExistingUser.emailId.equals(user.emailId)) {
			throw new UserExistsException("User with email ID " + user.emailId + " already exists");
		}
			
	}
	userList.add(user);
}


}
public class RemoveDuplicates {

	public static void main(String[] args) {
		User user1 = new User(1,"Hari","hari@gmail.com");
		User user2 = new User(2,"Haran","haran@gmail.com");
		User user3 = new User(3,"Hariharan","hari@gmail.com");
		
		UserManagement userManage = new UserManagement();
		try {
			userManage.register(user1);
			userManage.register(user2);
			userManage.register(user3);
			
		} catch (UserExistsException e) {
			System.out.println("Error : " + e.getMessage());
		}
		
		
		

	}

}
