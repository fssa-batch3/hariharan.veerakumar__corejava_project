package day09.practice.TaskModal;

import java.time.LocalDate;
import java.util.*;


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
	  @Override
	    public String toString() {
	        return "Task [id=" + id + ", name=" + name + ", deadline=" + deadline + ", priority=" + priority + "]";
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
	
	

	
	
//	class PriorityComparator implements Comparator<Tasklist>{
//		public int compare(Tasklist t1, Tasklist t2) {
//			if (t1.priority == t2.priority)
//				return 0;
//			else if (t1.priority > t2.priority)
//				return 1;
//			else
//				return -1;
//		}


//		@Override
//		public int compare(Tasklist p1, Tasklist p2) {
//	        return Integer.compare(p1.priority, p2.priority);
//	    }
}
	


public class TaskList1 {

	public static void main(String[] args) {
		
		ArrayList<Tasklist> list  = new ArrayList<>();
		list.add(new Tasklist(3, "Coding", LocalDate.of(2022, 10, 22), 5));
		list.add(new Tasklist(5, "Product Design", LocalDate.of(2022, 10, 01), 3));
		list.add(new Tasklist(1, "Software Design",LocalDate.of(2022, 10, 07), 2));
		list.add(new Tasklist(3,"Coding", LocalDate.of(2022, 10, 22), 1 ));
		
		System.out.println("List before sorting");
		System.out.println(list);
		Collections.sort(list, new combineComparator() );
		
		
	System.out.println();
	
	System.out.println("List after sorting");
		System.out.println(list);

	}

}
