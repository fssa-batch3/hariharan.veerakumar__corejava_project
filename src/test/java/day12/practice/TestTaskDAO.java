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
	    @Test
	    void testCreateTask() {
	        Task task = new Task();
	        task.id = 10;
	        task.taskName = "Task 10";
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
	        task.id = 4;
	        task.taskName = "Sample Task 3";
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
	        int taskId = 8;

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
}
