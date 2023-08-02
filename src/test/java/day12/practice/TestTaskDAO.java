package day12.practice;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestTaskDAO {
	
	 private TaskDAO taskDAO;

	    @BeforeEach
	    void setUp() {
	        taskDAO = new TaskDAO();
	    } 
		@BeforeAll
		public static void setupDatabase() throws SQLException {
			try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "123456");
					Statement stmt = connection.createStatement()) {
				// Create the "tasks" table if it doesn't exist
				String createTableQuery = "CREATE TABLE IF NOT EXISTS task (" + "id INT PRIMARY KEY, "
						+ "task_name VARCHAR(255), " + "task_status VARCHAR(50))";
				stmt.executeUpdate(createTableQuery);
			}
		}
		
		@AfterAll
	    public static void tearDownDatabase() throws SQLException {
	        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "123456");
	             Statement stmt = connection.createStatement()) {
	            // Drop the "tasks" table after all tests are executed
	            String dropTableQuery = "DROP TABLE IF EXISTS task";
	            stmt.executeUpdate(dropTableQuery);
	        }
	    }
	    @Test
	    void testCreateTask() {
	        Task task = new Task();
	        task.id = 3;
	        task.taskName = "Study";
	        task.status = "Pending";

	        try {
	            taskDAO.createTask(task);
	        } catch (DAOException e) {
	            e.printStackTrace();
	            fail("Failed to create task: " + e.getMessage());
	        }
	    }
	    
	    @Test
	    void testUpdateTask() {
	        Task task = new Task();
	        task.id = 2;
	        task.taskName = "Run";
	        task.status = "Pending";

	        try {
	            taskDAO.updateTask(task);
	        } catch (DAOException e) {
	            e.printStackTrace();
	            fail("Failed to update task: " + e.getMessage());
	        }
	    }
	    @Test
	    void testDeleteTask() {
	        int taskId = 2;

	        try {
	            taskDAO.deleteTask(taskId);
	        } catch (DAOException e) {
	            e.printStackTrace();
	            fail("Failed to delete task: " + e.getMessage());
	        }
	    }
	    
	    @Test
	    void testGetAllTasks() {
	        try {
	        	 
	             List<Task> tasks = taskDAO.getAllTasks();
	             for (Task task : tasks) {
	                 System.out.println(task.getId() + " - " + task.getTaskName() + " - " + task.getStatus());
	             }
	            
	        } catch (DAOException e) {
	            e.printStackTrace();
	            fail("Failed to get all tasks: " + e.getMessage());
	        }
	    }
	    @Test
	    void testGetTaskById() {
	    	int taskId = 1; 
	    	try {
	    		taskDAO.getTaskById(taskId);
			} catch (DAOException e) {
				e.printStackTrace();
	            fail("Failed to get task by Id: " + e.getMessage());
	        
			}
	    }
	  
}
