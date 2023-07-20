package day09.practice.TaskModal;

import java.time.LocalDate;
import java.util.*;

class Task implements Comparable<Task> {
	private int id;
	private String name;
	private LocalDate deadline;

	public Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
	}

	@Override
	public int compareTo(Task other) {
		return this.deadline.compareTo(other.deadline);
		}

}

public class ComparableTask {
	public static void main(String[] args) {

		Task task1 = new Task(3, "Coding", LocalDate.of(2022, 10, 22));
		Task task2 = new Task(5, "Product Design", LocalDate.of(2022, 10, 01));
		Task task3 = new Task(1, "Software Design", LocalDate.of(2022, 10, 07));
		Task task4 = new Task(3, "Coding", LocalDate.of(2022, 10, 22));

		ArrayList<Task> task = new ArrayList<Task>();
		task.add(task1);
		task.add(task2);
		task.add(task3);
		task.add(task4);

		System.out.println("Before Sorting");
		System.out.println(task);

		System.out.println("After Sorting");
		Collections.sort(task);
		System.out.println(task);

	}
}
