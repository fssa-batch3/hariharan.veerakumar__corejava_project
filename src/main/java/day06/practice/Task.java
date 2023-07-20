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
		
		List<Task1> TaskList = new ArrayList<Task1>();
		Task1 task1 = new Task1("Eating" , 4);
		Task1 task2 = new Task1("Workout" , 5);
		Task1 task3 = new Task1("Sleeping" , 2);
		
		TaskList.add(task1);
		TaskList.add(task2);
		TaskList.add(task3);
		
		for (Task1 task : TaskList) {
			System.out.println("Task name : " + task.taskName + " => Priority : "+ task.priority);
		
		}
		
		
   

	}

}
