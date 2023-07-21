package day10.solved;

import day06.practice.Task;

class NewTaskValidator {
	public static boolean validate(Task task)  {
		if (task == null)
			throw new IllegalArgumentException("Task is null");
		else if (task.getTaskName() == null || "".equals(task.getTaskName()))
			throw new IllegalArgumentException("Task name is empty");
		return true;
	}
}

public class ThrowRunTimeExceptionDemo {
	public static void main(String[] args) {
		Task task = new Task("",0);
//		task.setName("Creating test case"); Commenting this so that exception is thrown
		// Not surrounding with try catch as Illegal is a runtime exception
		NewTaskValidator.validate(task);
	}
}
