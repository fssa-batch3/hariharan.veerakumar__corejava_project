package day05.practice;


	class Department {
		String deptName;
		int deptId;
		
		public Department(String deptName, int deptId) {
			this.deptName = deptName;
			this.deptId = deptId;
		}
		
		@Override
		public String toString() {
			return "Department Name: " + deptName + "\nDepartment ID: " + deptId ;
		}
		
	}
	
	class Student {
		String name;
		int id;
		Department department;
		
		  public Student(String name, int id, Department department) {
		        this.name = name;
		        this.id = id;
		        this.department = department;
		    }
		    
		  @Override
		  public String toString() {
			  return "Student Name: " + name + "\nStudent Id: " + id + "\n" + department.toString();
		  }
		
		
	}
	public class College {	

		
	public static void main(String[] args) {
		
		 Department department = new Department("Bio Maths", 101);
		
		 Student student = new Student("John Wick", 1000, department);
		 
		 System.out.println(student.toString());

	}

}
