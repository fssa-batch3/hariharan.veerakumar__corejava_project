package day09.practice;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;



class Tasklist{
	
	 int id;
	String name;
	LocalDate deadline;
	int priority;
	
	public Tasklist(int id, String name,LocalDate deadline,int priority) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;
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

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	

}

class combineComparator implements Comparator<Tasklist>{
	
	 public int compare(Tasklist t1, Tasklist t2) {
		 int deadlineComparison = t1.deadline.compareTo(t2.deadline);
		 
		 if(deadlineComparison == 0) {
			 return Integer.compare(t1.priority, t2.priority);
		 }else {
			 return deadlineComparison;
		 }
	    }
}


public class TestTaskList {
	@Test 
	public void testValidElements() {
	     ArrayList<Tasklist> list = new ArrayList<>();
	        list.add(new Tasklist(3, "Coding", LocalDate.of(2022, 10, 22), 5));
	        list.add(new Tasklist(5, "Product Design", LocalDate.of(2022, 10, 01), 3));
	        list.add(new Tasklist(1, "Software Design", LocalDate.of(2022, 10, 07), 2));
	        list.add(new Tasklist(3, "Coding", LocalDate.of(2022, 10, 22), 1));
	        
	        Collections.sort(list, new combineComparator());
	        
	        assertEquals("Product Design", list.get(0).getName());
	        assertEquals("Software Design", list.get(1).getName());
	        assertEquals("Coding", list.get(2).getName());
	        assertEquals("Coding", list.get(3).getName());
	        
	        assertEquals(3, list.get(0).getPriority());
	        assertEquals(2, list.get(1).getPriority());
	        assertEquals(1, list.get(2).getPriority());
	        assertEquals(5, list.get(3).getPriority());
	        
	        
	        assertEquals(LocalDate.of(2022, 10, 01), list.get(0).getDeadline());
	        assertEquals(LocalDate.of(2022, 10, 07), list.get(1).getDeadline());
	        assertEquals(LocalDate.of(2022, 10, 22), list.get(2).getDeadline());
	        assertEquals(LocalDate.of(2022, 10, 22), list.get(3).getDeadline());

	}
	
	@Test
	public void testInvalidElements() {
		ArrayList<Tasklist> list = new ArrayList<>();
        list.add(new Tasklist(3, "Coding", LocalDate.of(2022, 10, 22), 5));
        list.add(new Tasklist(5, "Product Design", LocalDate.of(2022, 10, 01), 3));
        list.add(new Tasklist(1, "Software Design", LocalDate.of(2022, 10, 07), 2));
        list.add(new Tasklist(3, "Coding", LocalDate.of(2022, 10, 22), 1));
        
        Collections.sort(list, new combineComparator());
        
        assertNotEquals("coding", list.get(0).getName());
        assertNotEquals("product Design", list.get(1).getName());
        assertNotEquals("software Design", list.get(2).getName());
        assertNotEquals("coding", list.get(3).getName());
        
        
        assertNotEquals(2, list.get(0).getPriority());
        assertNotEquals(3, list.get(1).getPriority());
        assertNotEquals(5, list.get(2).getPriority());
        assertNotEquals(1, list.get(3).getPriority());
        
        assertNotEquals(LocalDate.of(2022, 10, 22), list.get(0).getDeadline());
        assertNotEquals(LocalDate.of(2022, 10, 01), list.get(1).getDeadline());
        assertNotEquals(LocalDate.of(2022, 10, 23), list.get(2).getDeadline());
        assertNotEquals(LocalDate.of(2022, 10, 07), list.get(3).getDeadline());
	}

}
