package day07.practice;

import java.util.*;



public class RemoveDuplicatesSet {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(100);
		numbers.add(100);
		numbers.add(1000);
		
		System.out.println("Integer without using Set : " + numbers);
		System.out.println();
		Set<Integer> DistinctNumbers = new HashSet<>(numbers);
		System.out.println("Unique Values: " + DistinctNumbers);
		


	}

}
