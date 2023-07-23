package day09.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.time.LocalDate;
import java.util.*;

import org.junit.Test;


class TestTask implements Comparable<TestTask> {
	private int id;
	private String name;
	private LocalDate deadline;

	public TestTask(int id, String name, LocalDate deadline) {
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
//
//	@Override
//	public int compareTo(TestTask other) {
//		return this.deadline.compareTo(other.deadline);
//		
//} 
	@Override
	public int compareTo(TestTask other) {
	    int dateComparison = this.deadline.compareTo(other.deadline);
	    if (dateComparison == 0) {
	        return Integer.compare(this.id, other.id); 
	    }
	    return dateComparison;
	}
	}

public class TestComparableTask {
@Test
public void testValidSorting() {
	TestTask task1 = new TestTask(3, "Coding", LocalDate.of(2022, 10, 22));
	TestTask task2 = new TestTask(5, "Product Design", LocalDate.of(2022, 10, 01));
	TestTask task3 = new TestTask(1, "Software Design", LocalDate.of(2022, 10, 07));
	TestTask task4 = new TestTask(3, "Coding", LocalDate.of(2022, 10, 22));

      ArrayList<TestTask> taskList = new ArrayList<>();
      taskList.add(task1);
      taskList.add(task2);
      taskList.add(task3);
      taskList.add(task4);

   

   
      Collections.sort(taskList);
      
      assertEquals(4, taskList.size());
      
      assertEquals(task2, taskList.get(0));
      assertEquals(task3, taskList.get(1));
      assertEquals(task1, taskList.get(2));
      assertEquals(task4, taskList.get(3));
     
 
}
@Test
public void testInvalidSorting() {
	TestTask task1 = new TestTask(3, "Coding", LocalDate.of(2022, 10, 22));
	TestTask task2 = new TestTask(5, "Product Design", LocalDate.of(2022, 10, 01));
	TestTask task3 = new TestTask(1, "Software Design", LocalDate.of(2022, 10, 07));
	TestTask task4 = new TestTask(3, "Coding", LocalDate.of(2022, 10, 22));

      ArrayList<TestTask> taskList = new ArrayList<>();
      taskList.add(task1);
      taskList.add(task2);
      taskList.add(task3);
      taskList.add(task4);

  
      Collections.sort(taskList);
      
assertNotEquals(5, taskList.size());
      
assertNotEquals(task1, taskList.get(0));
assertNotEquals(task4, taskList.get(1));
assertNotEquals(task2, taskList.get(2));
assertNotEquals(task3, taskList.get(3));
}
}
