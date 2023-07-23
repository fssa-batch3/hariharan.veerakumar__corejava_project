package day06.practice;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;


class FindTask {
    public String taskName;
    public int priority;

    public FindTask(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    public static boolean findTaskByName(String taskname, List<FindTask> tasks) {
        for (FindTask task : tasks) {
            if (task.taskName.equals(taskname)) {
                return true;
            }
        }
        return false;
    }
}

public class TestFindTask {
    @Test
    public void testValidTask() {
        List<FindTask> taskList = new ArrayList<FindTask>();
        FindTask task1 = new FindTask("Eating", 4);
        FindTask task2 = new FindTask("Workout", 5);
        FindTask task3 = new FindTask("Sleeping", 2);

        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        boolean found = FindTask.findTaskByName("Workout", taskList);
        assertTrue(found);
    }
    
    @Test
    public void testInvalidTask() {
        List<FindTask> taskList = new ArrayList<FindTask>();
        FindTask task1 = new FindTask("Eating", 4);
        FindTask task2 = new FindTask("Workout", 5);
        FindTask task3 = new FindTask("Sleeping", 2);

        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        boolean found = FindTask.findTaskByName("running", taskList);
        assertFalse(found);
    }
}
