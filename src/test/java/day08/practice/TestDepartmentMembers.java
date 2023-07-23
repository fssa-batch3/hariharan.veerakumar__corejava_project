package day08.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class TestDepartmentMembers {
	@Test
	public void testValidDepartmentMembers() {
		String input = "HR,Ram,HR,Suresh,IT,Basker,IT,Joseph,Admin,Sundar";
		String[] parts = input.split(",");

		Map<String, List<String>> departmentEmployees = new HashMap<>();

		for (int i = 0; i < parts.length; i += 2) {
			String department = parts[i];
			String employee = parts[i + 1];

			if (departmentEmployees.containsKey(department)) {
				List<String> employees = departmentEmployees.get(department);
				employees.add(employee);
			} else {
				List<String> employees = new ArrayList<>();
				employees.add(employee);
				departmentEmployees.put(department, employees);
			}
		}

		assertEquals(3, departmentEmployees.size());
		assertTrue(departmentEmployees.containsKey("HR"));
		assertTrue(departmentEmployees.containsKey("IT"));
		assertTrue(departmentEmployees.containsKey("Admin"));

		List<String> hrEmployees = departmentEmployees.get("HR");
		assertEquals(2, hrEmployees.size());
		assertTrue(hrEmployees.contains("Ram"));
		assertTrue(hrEmployees.contains("Suresh"));

		List<String> itEmployees = departmentEmployees.get("IT");
		assertEquals(2, itEmployees.size());
		assertTrue(itEmployees.contains("Basker"));
		assertTrue(itEmployees.contains("Joseph"));

		List<String> adminEmployees = departmentEmployees.get("Admin");
		assertEquals(1, adminEmployees.size());
		assertTrue(adminEmployees.contains("Sundar"));
	}

	@Test
	public void testInvalidDepartmentMembers() {
		String input = "HR,Ram,HR,Suresh,IT,Basker,IT,Joseph,Admin,Sundar";
		String[] parts = input.split(",");

		Map<String, List<String>> departmentEmployees = new HashMap<>();

		for (int i = 0; i < parts.length; i += 2) {
			String department = parts[i];
			String employee = parts[i + 1];

			if (departmentEmployees.containsKey(department)) {
				List<String> employees = departmentEmployees.get(department);
				employees.add(employee);
			} else {
				List<String> employees = new ArrayList<>();
				employees.add(employee);
				departmentEmployees.put(department, employees);
			}
		}
		assertNotEquals(4, departmentEmployees.size());
		assertFalse(departmentEmployees.containsKey("Sales"));
		assertFalse(departmentEmployees.containsKey("Support"));
		assertFalse(departmentEmployees.containsKey("management"));

		List<String> hrEmployees = departmentEmployees.get("HR");
		assertNotEquals(3, hrEmployees.size());
		assertFalse(hrEmployees.contains("Somu"));
		assertFalse(hrEmployees.contains("Dinesh"));

		List<String> itEmployees = departmentEmployees.get("IT");
		assertNotEquals(3, itEmployees.size());
		assertFalse(itEmployees.contains("Vijaya"));
		assertFalse(itEmployees.contains("Kuruvila"));

		List<String> adminEmployees = departmentEmployees.get("Admin");
		assertNotEquals(3, adminEmployees.size());
		assertFalse(adminEmployees.contains("Bandar"));
		
	}
}
