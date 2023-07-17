package day06.solved;
import java.util.*;

public class StringArray {
	public static void main(String[] args) {

	// How its stored in an normal array
	String[] cityArr = new String[3];
	cityArr[0] = "Chennai";
	cityArr[1] = "Bangalore";
	cityArr[2] = "Mumbai";
	
	cityArr[1] = "Kolkata";
	cityArr[2] = "Delhi";
	
	ArrayList<String> array =new ArrayList<String>();
	array.add("Chennai");
	array.add("Bangalore");
	array.add("Mumbai");
	
	array.set(1,"Kolkata");
	array.remove(2);
	array.add("Delhi");
	
	System.out.println(array);
	
	
	
	

	// Display the city names
//	for (String cityName : cityArr) {
//		System.out.print(cityName + " ");
//	}
}

}
