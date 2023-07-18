package day06.practice;
import java.util.*;

public class FindTask {
	
	   public String taskName;
	    public int priority;

	    public FindTask(String taskName, int priority) {
	        this.taskName = taskName;
	        this.priority = priority;
	    }

	public static void main(String[] args) {
          List<FindTask> taskList = new ArrayList<FindTask>();
          
      	FindTask task1 = new FindTask("Eating" , 4);
      	FindTask task2 = new FindTask("Workout" , 5);
      	FindTask task3 = new FindTask("Sleeping" , 2);
      	
      	taskList.add(task1);
      	taskList.add(task2);
      	taskList.add(task3);
      	
      	boolean found = findTaskByName("Workout", taskList); 
      	System.out.println(found);

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
