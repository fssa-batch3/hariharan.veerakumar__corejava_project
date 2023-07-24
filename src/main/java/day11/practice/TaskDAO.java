package day11.practice;



import day11.solved.ConnectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskDAO {

	
	public void createTask(Task task) throws DAOException, SQLException {
        
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "123456");
        System.out.println(connection);

    
        String query = "INSERT INTO task (id, task_name, task_status) VALUES (?, ?, ?)";

     
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, task.id);
        stmt.setString(2, task.name);
        stmt.setString(3, task.status);
        stmt.executeUpdate();
        System.out.println("Row Inserted Successfully");
       
        
        ConnectionUtil.close(connection, stmt, null);
    
	

}
}