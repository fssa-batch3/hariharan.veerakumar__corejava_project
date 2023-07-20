package day09.practice;
import java.util.*;

public class CollectionNumbers {

	public static void main(String[] args) {
		List<Integer>  numbers = new ArrayList<Integer>();
		numbers.add(8);
		numbers.add(9);
		numbers.add(45);
		numbers.add(12);
		numbers.add(1);
		
		System.out.print("List before sorted " +numbers +" ");
		Collections.sort(numbers);
		System.out.println();
		System.out.print("List After Sorted " +numbers+ " " );
		

	}

}
