package day08.practice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class DepartmentMembers {

	public static void main(String[] args) {
		
		String input = "HR,Ram,HR,Suresh,IT,Basker,IT,Joseph,Admin,Sundar";

   
        String[] parts = input.split(",");

        
        Map<String, List<String>> departmentEmployees = new HashMap<>();
 
        for (int i = 0; i < parts.length; i += 2) {
            String department = parts[i];
            String employee = parts[i + 1];

           
            if (departmentEmployees.containsKey(department)) {
                List<String> employees = departmentEmployees.get(department);
                employees.add(employee);
            }
            
            else {
                List<String> employees = new ArrayList<>();
                employees.add(employee);
                departmentEmployees.put(department, employees);
            }
        }

      
        for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
            String department = entry.getKey();
            List<String> employees = entry.getValue();
            System.out.println(department + ": " + String.join(", ", employees));
        }

	}

}
