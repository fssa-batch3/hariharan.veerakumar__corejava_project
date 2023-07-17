package day02.practice;

public class User {
	private int id;
	private String name;
	private String password;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

}
