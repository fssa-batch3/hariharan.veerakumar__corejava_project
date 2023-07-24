package day11.practice;

import day11.practice.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

public class TestTaskDAO {
	
	 @Test
	    void testCreateTask() {
	        TaskDAO taskDAO = new TaskDAO();
	        Task task = new Task(4,"Sample Task 3","Pending");

	        assertThrows(SQLException.class, () -> taskDAO.createTask(task));
	    }
	    
	    @Test
	    void validTestCreateTask() {
	        TaskDAO taskDAO = new TaskDAO();
	        Task task = new Task(6,"Sample Task 6","Pending");

	        try {
	            taskDAO.createTask(task);
	        } catch (DAOException | SQLException e) {
	            e.printStackTrace();
	            fail("An exception occurred: " + e.getMessage());
	        }
	    }

}
