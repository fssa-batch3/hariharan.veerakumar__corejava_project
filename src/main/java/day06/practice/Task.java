package day06.practice;
import java.util.*;

public class Task {
	 public String taskName;
     
	    public int priority;
	    
	    public Task(String taskName,int priority) {
	    	this.taskName = taskName;
	    	this.priority = priority;
	    }
	    
	    

	public String getTaskName() {
			return taskName;
		}



		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}



		public int getPriority() {
			return priority;
		}



		public void setPriority(int priority) {
			this.priority = priority;
		}



	public static void main(String[] args) {
		
		List<day06.practice.Task> TaskList = new ArrayList<>();
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
