package day03.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestEmployee {
	
	 public static void main(String[] args) {
         Employee e1 = new Employee(1, "naresh");
         Employee e2 = new Employee(2, "suresh");
         
         System.out.println("id = " + e1.getId()+ ", "+"name = " + e1.getName());
         System.out.println("id = " + e2.getId()+ ", "+"name = " + e2.getName());
         
     }
@Test
public void testGettersSetters() {
	Employee e1 = new Employee(1, "naresh");
    Employee e2 = new Employee(2, "suresh");
    
    assertEquals(1,e1.getId());
    assertEquals("naresh",e1.getName());
    
    assertEquals(2,e2.getId());
    assertEquals("suresh",e2.getName());
}
}
