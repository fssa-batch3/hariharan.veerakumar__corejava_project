package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.time.LocalDate;
import java.util.Objects;



class Task {
	 private int id;
	    private String name;
	    private LocalDate deadline;

	    public Task(int id, String name, LocalDate deadline) {
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

	    @Override
	    public int hashCode() {
//	        final int prime = 31;
//	        int result = 1;
//	        result = prime * result + ((deadline == null) ? 0 : deadline.hashCode());
//	        result = prime * result + id;
//	        result = prime * result + ((name == null) ? 0 : name.hashCode());
//	        return result;
	    	return Objects.hash(this.name, this.deadline);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        Task other = (Task) obj;
	        if (deadline == null) {
	            if (other.deadline != null)
	                return false;
	        } else if (!deadline.equals(other.deadline))
	            return false;
	        if (name == null) {
	            if (other.name != null)
	                return false;
	        } else if (!name.equals(other.name))
	            return false;
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "Task [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
	    }
}

public class RemoveTasks {
    public static void main(String[] args) {
    	
    	ArrayList a = new ArrayList();
		a.hashCode();
    	
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Task 1", LocalDate.of(2023, 10, 1)));
        tasks.add(new Task(2, "Task 2", LocalDate.of(2023, 10, 1)));
        tasks.add(new Task(3, "Task 1", LocalDate.of(2023, 10, 1)));
        
        

        
        HashSet<Task> uniqueTasks = new HashSet<>(tasks);

       
        System.out.println("Unique tasks:");
        for (Task task : uniqueTasks) {
            System.out.println(task);
        }
    }
}
	

	
