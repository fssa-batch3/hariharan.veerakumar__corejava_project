package day12.solved;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAuthenticator {

	public static void main(String[] args) {

        boolean isAuthenticated = authenticateUser("1 == 1 ", "Strong_Password");

        if (isAuthenticated) {
            System.out.println("User is authenticated.");
        } else {
            System.out.println("Authentication failed.");
        }

	}
	
	 public static boolean authenticateUser(String username, String password) {
		 
	        String query = "SELECT * FROM user WHERE username=? AND password=?";

	        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "123456");
	             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

	            preparedStatement.setString(1, username);
	            preparedStatement.setString(2, password);

	            ResultSet resultSet = preparedStatement.executeQuery();
	            boolean userExists = resultSet.next();
	            resultSet.close();

	            return userExists;

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return false;
	    }

}
