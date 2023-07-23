package day06.practice;
import java.util.*;

public class FindTask1 {
	
	   public String taskName;
	    public int priority;

	    public FindTask1(String taskName, int priority) {
	        this.taskName = taskName;
	        this.priority = priority;
	    }

	public static void main(String[] args) {
          List<FindTask1> taskList = new ArrayList<FindTask1>();
          
      	FindTask1 task1 = new FindTask1("Eating" , 4);
      	FindTask1 task2 = new FindTask1("Workout" , 5);
      	FindTask1 task3 = new FindTask1("Sleeping" , 2);
      	
      	taskList.add(task1);
      	taskList.add(task2);
      	taskList.add(task3);
      	
      	boolean found = findTaskByName("Workout", taskList); 
      	System.out.println(found);

	}
	public static boolean findTaskByName(String taskname, List<FindTask1> tasks) {
		for (FindTask1 task : tasks) {
			if (task.taskName.equals(taskname)) {
				return true;
			}
		}
		return false;
	}

}
