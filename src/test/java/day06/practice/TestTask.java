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

		        assertEquals(3, taskList.size());

		        Task1 firstTask = taskList.get(0);
		        assertEquals("Eating", firstTask.taskName);
		        assertEquals(4, firstTask.priority);

		        Task1 secondTask = taskList.get(1);
		        assertEquals("Workout", secondTask.taskName);
		        assertEquals(5, secondTask.priority);

		        Task1 thirdTask = taskList.get(2);
		        assertEquals("Sleeping", thirdTask.taskName);
		        assertEquals(2, thirdTask.priority);
		    }

	

}
