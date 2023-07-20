package day06.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

class Task1 {
    String taskName;
    int priority;

    public Task1(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }
}

public class TestTask {		
		   @Test
		   public void testTaskList() {
		        List<Task> taskList = new ArrayList<>();

		        Task task1 = new Task("Eating", 4);
		        Task task2 = new Task("Workout", 5);
		        Task task3 = new Task("Sleeping", 2);

		        taskList.add(task1);
		        taskList.add(task2);
		        taskList.add(task3);

		        assertEquals(3, taskList.size(), "Size of taskList should be 3");

		        Task firstTask = taskList.get(0);
		        assertEquals("Eating", firstTask.taskName, "Task name should be 'Eating'");
		        assertEquals(4, firstTask.priority, "Priority should be 4");

		        Task secondTask = taskList.get(1);
		        assertEquals("Workout", secondTask.taskName, "Task name should be 'Workout'");
		        assertEquals(5, secondTask.priority, "Priority should be 5");

		        Task thirdTask = taskList.get(2);
		        assertEquals("Sleeping", thirdTask.taskName, "Task name should be 'Sleeping'");
		        assertEquals(2, thirdTask.priority, "Priority should be 2");
		    }

	

}
