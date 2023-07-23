package day07.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class TestRemoveTasks {

	@Test
	public void testValidTask() {
		Task task1 = new Task(1, "Task 1", LocalDate.of(2023, 10, 1));
		Task task2 = new Task(1, "Task 1", LocalDate.of(2023, 10, 1));
		Task task3 = new Task(2, "Task 2", LocalDate.of(2023, 10, 1));

		assertTrue(task1.equals(task2));
		assertFalse(task1.equals(task3));
	}
	@Test
	public void testInvalidTasks() {
		Task task1 = new Task(1, "Task 1", LocalDate.of(2023, 10, 1));
		Task task2 = new Task(1, "Task 1", LocalDate.of(2023, 10, 1));
		Task task3 = new Task(2, "Task 2", LocalDate.of(2023, 10, 1));

		assertFalse(task1.equals(task3));
		assertTrue(task1.equals(task2));
	}
	@Test
	public void testValidSet() {
		 ArrayList<Task> tasks = new ArrayList<>();
	        tasks.add(new Task(1, "Task 1", LocalDate.of(2023, 10, 1)));
	        tasks.add(new Task(2, "Task 2", LocalDate.of(2023, 10, 1)));
	        tasks.add(new Task(3, "Task 1", LocalDate.of(2023, 10, 1)));

	        HashSet<Task> uniqueTasks = new HashSet<>(tasks);
	        assertEquals(2, uniqueTasks.size());
			}
	
	@Test
	public void testInvalidSet(){
		ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Task 1", LocalDate.of(2023, 10, 1)));
        tasks.add(new Task(2, "Task 2", LocalDate.of(2023, 10, 1)));
        tasks.add(new Task(3, "Task 1", LocalDate.of(2023, 10, 1)));

        HashSet<Task> uniqueTasks = new HashSet<>(tasks);
        assertNotEquals(4, uniqueTasks.size());
		}
}
