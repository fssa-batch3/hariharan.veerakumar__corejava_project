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
		        List<Task1> taskList = new ArrayList<>();

		        Task1 task1 = new Task1("Eating", 4);
		        Task1 task2 = new Task1("Workout", 5);
		        Task1 task3 = new Task1("Sleeping", 2);

		        taskList.add(task1);
		        taskList.add(task2);
		        taskList.add(task3);

		        assertEquals(3, taskList.size(), "Size of taskList should be 3");

		        Task1 firstTask = taskList.get(0);
		        assertEquals("Eating", firstTask.taskName, "Task name should be 'Eating'");
		        assertEquals(4, firstTask.priority, "Priority should be 4");

		        Task1 secondTask = taskList.get(1);
		        assertEquals("Workout", secondTask.taskName, "Task name should be 'Workout'");
		        assertEquals(5, secondTask.priority, "Priority should be 5");

		        Task1 thirdTask = taskList.get(2);
		        assertEquals("Sleeping", thirdTask.taskName, "Task name should be 'Sleeping'");
		        assertEquals(2, thirdTask.priority, "Priority should be 2");
		    }

	

}
