package day06.practice;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestStringArray {
	
	@Test
	public void testValidCities() {
	
	List<String> cityList = new ArrayList<String>();
	cityList.add("Chennai");
	cityList.add("Bangalore");
	cityList.add("Mumbai");
	cityList.add("Mumbai");

	
	List<String> uniqueCity = new ArrayList<>();
	for (String city : cityList) {
		if (!uniqueCity.contains(city)) {
			uniqueCity.add(city);
		}
	}
	assertEquals(3,uniqueCity.size());
	assertEquals("Chennai",uniqueCity.get(0));
	assertEquals("Bangalore",uniqueCity.get(1));
	assertEquals("Mumbai",uniqueCity.get(2));
	}
	
	
	@Test
	public void testInvalidCities() {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		
		List<String> uniqueCity = new ArrayList<>();
		for (String city : cityList) {
			if (!uniqueCity.contains(city)) {
				uniqueCity.add(city);
			}
		}
		assertNotEquals(2,uniqueCity.size());
		assertNotEquals("chennai",uniqueCity.get(0));
		assertNotEquals("bangalore",uniqueCity.get(1));
		assertNotEquals("mumbai",uniqueCity.get(2));
	}
}
