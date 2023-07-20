package day06.solved;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import day06.practice.Task;

public class TestArrayList {
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
