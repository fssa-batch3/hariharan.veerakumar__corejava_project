package day03.practice;

public class Employee {
	   private int id;
	    private String name;
	 
	    public Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	    public int getId() {
	    	return id;
	    }
	    public String getName() {
	    	return name;
	    }
	    /**
	     * @author HariharanVeerakumar
	     *
	     */
	    public class TestEmployee {
	    	 
	        public static void main(String[] args) {
	            Employee e1 = new Employee(1, "naresh");
	            Employee e2 = new Employee(2, "suresh");
	            
	            System.out.println("id = " + e1.getId()+ ", "+"name = " + e1.getName());
	            System.out.println("id = " + e2.getId()+ ", "+"name = " + e2.getName());
	            
	        }
	    }
}
