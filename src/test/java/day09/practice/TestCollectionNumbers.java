package day09.practice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.*;


public class TestCollectionNumbers {
@Test 
public void testValidElements() {
	List<Integer>  numbers = new ArrayList<Integer>();
	numbers.add(8);
	numbers.add(9);
	numbers.add(45);
	numbers.add(12);
	numbers.add(1);
	
	Collections.sort(numbers);
	
	assertEquals(5,numbers.size());
	assertEquals(1,numbers.get(0));
	assertEquals(8,numbers.get(1));
	assertEquals(9,numbers.get(2));
	assertEquals(12,numbers.get(3));
	assertEquals(45,numbers.get(4));
	
}
@Test
public void testInvalidElements() {
	List<Integer>  numbers = new ArrayList<Integer>();
	numbers.add(8);
	numbers.add(9);
	numbers.add(45);
	numbers.add(12);
	numbers.add(1);
	
	Collections.sort(numbers);
	
	assertNotEquals(6,numbers.size());
	assertNotEquals(45,numbers.get(0));
	assertNotEquals(12,numbers.get(1));
	assertNotEquals(1,numbers.get(2));
	assertNotEquals(8,numbers.get(3));
	assertNotEquals(9,numbers.get(4));
	
}
}
