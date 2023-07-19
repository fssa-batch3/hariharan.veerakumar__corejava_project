package day08.practice;
import java.util.*;

public class NameCounting {

	public static void main(String[] args) {
	String str = "Ram, Ram, Superman, spider, hey, hello, hey, Spider";
	
	String[] names = str.split(",");
	
	HashMap<String, Integer> nameCount = new HashMap<>();
	
	for (String name : names) {
		name = name.trim();
		nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
	}
	
	System.out.println("Names after counting :");
	for(Map.Entry<String,Integer> entry : nameCount.entrySet()) {
		String name = entry.getKey();
		Integer count = entry.getValue();
		System.out.println(name + ": "+ count);
	}
	
 
	}

}
