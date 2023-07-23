package day07.practice;
import static org.junit.Assert.*;


import java.util.*;

import org.junit.Test;


public class TestRemoveDuplicatesSet {
	@Test
	public void testValidSet() {
		List<Integer> numbers = new ArrayList <Integer>();
		    numbers.add(10);
	        numbers.add(10);
	        numbers.add(10);
	        numbers.add(100);
	        numbers.add(100);
	        numbers.add(1000);
	        
	        Set<Integer> FirstSet = new TreeSet<>();
	        FirstSet.add(10);
	        FirstSet.add(100);
	        FirstSet.add(1000);
	        
	        Set<Integer> SecondSet = new TreeSet<>(numbers);
	        assertEquals(FirstSet,SecondSet);

	}

	@Test
	public void testInvalidSet() {
		List<Integer> numbers = new ArrayList <Integer>();
	    numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(100);
        numbers.add(100);
        numbers.add(1000);
        
        Set<Integer> FirstSet = new TreeSet<>();
        FirstSet.add(10);
        FirstSet.add(100);
        FirstSet.add(1000);
        FirstSet.add(1);
        
        Set<Integer> SecondSet = new TreeSet<>(numbers);
        assertNotEquals(FirstSet,SecondSet);
	}
}
