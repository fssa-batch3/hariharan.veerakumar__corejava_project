package day06.practice;
import java.util.*;

public class Task {
	 public String taskName;
     
	    public int priority;
	    
	    public Task(String taskName,int priority) {
	    	this.taskName = taskName;
	    	this.priority = priority;
	    }

	public static void main(String[] args) {
		
		List<Task> TaskList = new ArrayList<Task>();
		Task task1 = new Task("Eating" , 4);
		Task task2 = new Task("Workout" , 5);
		Task task3 = new Task("Sleeping" , 2);
		
		TaskList.add(task1);
		TaskList.add(task2);
		TaskList.add(task3);
		
		for (Task task : TaskList) {
			System.out.println("Task name : " + task.taskName + " => Priority : "+ task.priority);
		
		}
		
		
   

	}

}
