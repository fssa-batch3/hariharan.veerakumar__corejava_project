package day12.solved;

import java.sql.Connection;
import java.sql.PreparedStatement;
import day11.solved.*;

public class TestUserUpdatePassword {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 Connection connection = ConnectionUtil.getConnection();
		 
	        // Input
	        String userName = "bharathwaj";
	        String password = "007Password";
	        
	       
	        // DEPOSIT
	        String query = "UPDATE user SET password=? WHERE username=?";
	 
	        PreparedStatement pst = connection.prepareStatement(query);
	        pst.setString(1, password);
	        pst.setString(2, userName);
	 
	        int rows = pst.executeUpdate();
	        System.out.println("No of rows updated : " + rows);

	}

}
