package day06.practice;
import java.util.*;

public class StringArray {
public static void main(String[] args) {
	List<String> cityList = new ArrayList<String>();
	cityList.add("Chennai");
	cityList.add("Bangalore");
	cityList.add("Mumbai");
	cityList.add("Mumbai");
	
//	cityList.remove(3);
//	cityList.add(3,"Dehli");
	
	List<String> uniqueCity = new ArrayList<>();
	for (String city : cityList) {
		if (!uniqueCity.contains(city)) {
			uniqueCity.add(city);
			System.out.println(city);
		}
	}
	
//    int n = cityList.size();
//
//    for (int i = 0; i < n; i++) {
//        String currentCity = cityList.get(i);
//
//        for (int j = i + 1; j < n; j++) {
//            String nextCity = cityList.get(j);
//
//            if (currentCity.equals(nextCity)) {
//                cityList.remove(j);
//                cityList.add("Delhi");
//                n--; 
//                j--; 
//            }
//        }
//    }
    
	
//	System.out.println(cityList);
}
}
